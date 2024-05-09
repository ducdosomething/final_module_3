package org.example.library_manager.model;

import java.sql.SQLException;
import java.util.List;

public interface IBookDAO {
    public List<Book> showAllBooks();
    public Book searchBookById(int id);
}
