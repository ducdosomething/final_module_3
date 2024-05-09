package org.example.library_manager.service;

import org.example.library_manager.model.Book;
import org.example.library_manager.model.IBookDAO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookDAO implements IBookDAO {

    private static final String SELECT_ALL_BOOKS = "select * from books ;";
    private static final String SELECT_BOOK_BY_ID = "select * from books where id = ?;";
    private static final String BORROW_BOOK = "INTO book_card (id, book_id, student_id, borrowing_day, returning_day, status) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_BOOK_QUANTITY = "UPDATE books SET quantity = quantity - 1 WHERE id = ? AND quantity > 0";
    ConnectionDAO cs = new ConnectionDAO();
    @Override
    public List<Book> showAllBooks() {
        List<Book> books = new ArrayList<>();

        try {
            Connection connection = cs.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SELECT_ALL_BOOKS);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String author = rs.getString("author");
                String description = rs.getString("description");
                int quantity = rs.getInt("quantity");
                Book book = new Book(id, name, author, description, quantity);
                books.add(book);
            }
        } catch (SQLException sqlException) {
            cs.printSQLException(sqlException);
        }

        return books;
    }

    @Override
    public Book searchBookById(int id) {
        Book book = null;
        try (Connection connection = cs.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BOOK_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String author = rs.getString("author");
                String description = rs.getString("description");
                int quantity = rs.getInt("quantity");
                String className = rs.getString("classroom_name");

                book = new Book(id, name, author, description, quantity);
            }
        } catch (SQLException e) {
            cs.printSQLException(e);
        }
        return book;
    }


}
