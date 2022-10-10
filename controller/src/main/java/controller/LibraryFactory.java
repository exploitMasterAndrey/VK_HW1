package controller;

import model.Author;
import model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryFactory {
    private static String dbURL = "jdbc:postgresql://localhost:5432/VK_HW1";
    private static String dbUSER = "postgres";
    private static String dbPASSWORD = "postgres";

    private static Library library;

    public static Library getLibrary(){
        List<Book> bookList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(dbURL, dbUSER, dbPASSWORD);
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT author_name, book_name\n" +
                    "FROM Author\n" +
                    "    JOIN Book ON Author.id = Book.author_id;";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()){
                bookList.add(new Book(resultSet.getString("book_name"), new Author(resultSet.getString("author_name"))));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        library = new Library(bookList);
        return library;
    }
}
