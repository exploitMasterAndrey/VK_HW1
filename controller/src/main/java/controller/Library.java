package controller;

import com.google.gson.Gson;
import model.Book;

import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBooksByAuthor(String authorName){
        return bookList.stream().filter(book -> book.getAuthor().getName().equals(authorName)).collect(Collectors.toList());
    }

    public static String getJsonSerialized(List<Book> bookListToJson){
        Gson gson = new Gson();
        String res = gson.toJson(bookListToJson);
        return res;
    }
}
