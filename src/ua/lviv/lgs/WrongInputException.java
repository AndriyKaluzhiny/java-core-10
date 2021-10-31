package ua.lviv.lgs;

public class WrongInputException extends Throwable {
    void WrongInputException() {
        System.err.println("Wrong input, it's not 5 symbols word");
    }
}
