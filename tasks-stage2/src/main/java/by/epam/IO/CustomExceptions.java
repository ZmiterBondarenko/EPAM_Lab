package by.epam.IO;

public class CustomExceptions {
    static class IncorectPathException extends Exception {
        public IncorectPathException(String message) {
            System.out.println(message);
        }
    }
}
