package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void menu() {
        System.out.println("Enter 1 for Task 1");
        System.out.println("Enter 2 for Task 2");
        System.out.println("Enter 3 for Task 3");
        System.out.println("Enter 4 for Task 4");
        System.out.println("Enter 0 to exit");
    }

    public static void main(String[] args) throws WrongInputException {
        menu();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        switch (input) {
            case "0":
                System.exit(1);

            case "1": {
                System.out.println("Enter word(It must be at most 5 symbols): ");
                Scanner sc1 = new Scanner(System.in);
                String word = sc1.next();

                boolean flag = false;

                if (word.length() == 5) {
                    flag = true;
                }

                if (flag) {
                    StringBuffer wordReverse = new StringBuffer();
                    wordReverse.append(word).reverse();

                    if (word.equalsIgnoreCase(wordReverse.toString())) {
                        System.out.println("It's a palindrome word");
                    } else
                        System.out.println("It isn't palindrome word, try another one");
                }
                if (!flag) {
                    throw new WrongInputException();
                }

            }
            case "2": {
                System.out.println("Enter word: ");
                Scanner sc2 = new Scanner(System.in);
                String input2 = sc2.next();

                char [] input2Ch = input2.toCharArray();

                for (int i = 0; i < input2Ch.length; i++) {
                    if (input2Ch[i] == 'а' || input2Ch[i] == 'о' || input2Ch[i] == 'у' || input2Ch[i] == 'и' || input2Ch[i] == 'е' || input2Ch[i] == 'і') {
                        input2Ch[i] = '-';
                    }
                }
                System.out.println(input2Ch);
            }
            case "3": {
                System.out.println("Enter a sentence: ");
                Scanner sc3 = new Scanner(System.in);
                String sentence = sc3.nextLine();

                int count = 0;
                int max = 0;
                for (int i = 0; i < sentence.split(" ").length; i++) {
                    count = i;
                }
                System.out.println(count + 1);
            }
            case "4": {                                             // used stackoverflow
                System.out.println("Enter a sentence: ");
                Scanner sc3 = new Scanner(System.in);
                String sentence = sc3.nextLine();

                String[] splited = sentence.split(" ");
                Arrays.sort(splited);

                String word = splited[0];
                String curr = splited[0];

                int count = 0;
                int max = 0;

                for (int i = 0; i < splited.length; i++) {
                    if (splited[i].equals(curr)) {
                        count++;
                    } else {
                        count = 1;
                        curr = splited[i];
                    }

                    if (max < count) {
                        max = count;
                        word = splited[i];
                    }
                }
                System.out.println(max + " " + word);
            }
        }
    }
}
