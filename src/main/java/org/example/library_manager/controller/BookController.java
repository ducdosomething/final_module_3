package org.example.library_manager.controller;

import org.example.library_manager.model.Book;
import org.example.library_manager.service.BookDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BookController", urlPatterns = "/books")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 50, // 50MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB
public class BookController extends HttpServlet {
    private BookDAO bookDAO;
    public void init() {
        bookDAO = new BookDAO();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
//                case "create":
//                    insertStudent(req, resp);
//                    break;
//                case "edit":
//                    updateStudent(req, resp);
//                    break;
//                case "delete":
//                    deleteStudent(req,resp);
//                    break;
                default:
                    listBook(req,resp);
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
//                case "create":
//                    showInsertForm(req, resp);
//                    break;
//                case "edit":
//                    showEditForm(req, resp);
//                    break;
//                case "delete":
//                    showFormDelete(req, resp);
//                    break;
                default:
                    listBook(req, resp);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listBook(HttpServletRequest req, HttpServletResponse resp)
            throws SQLException, IOException, ServletException {
        List<Book> listBook = bookDAO.showAllBooks();
        req.setAttribute("listBook", listBook);
        RequestDispatcher dispatcher= req.getRequestDispatcher("/view/list.jsp");
        dispatcher.forward(req, resp);
    }
}
