package controller;

public class Application {
    public static void main(String[] args) {
        System.out.println(Library.getJsonSerialized(LibraryFactory.getLibrary().getBooksByAuthor("Pushkin A.S.")));
    }
}
