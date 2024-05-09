package org.example.library_manager.model;

import java.time.LocalDate;

public class BookCard {
    private int id;
    private Book book;
    private Student student;
    private boolean status;
    private LocalDate borrowingDay;
    private LocalDate returningDay;

    public BookCard() {
    }

    public BookCard(int id, Book book, Student student, boolean status, LocalDate borrowingDay, LocalDate returningDay) {
        this.id = id;
        this.book = book;
        this.student = student;
        this.status = status;
        this.borrowingDay = borrowingDay;
        this.returningDay = returningDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getBorrowingDay() {
        return borrowingDay;
    }

    public void setBorrowingDay(LocalDate borrowingDay) {
        this.borrowingDay = borrowingDay;
    }

    public LocalDate getReturningDay() {
        return returningDay;
    }

    public void setReturningDay(LocalDate returningDay) {
        this.returningDay = returningDay;
    }

    @Override
    public String toString() {
        return "BookCard{" +
                "id=" + id +
                ", book=" + book +
                ", student=" + student +
                ", status=" + status +
                ", borrowingDay=" + borrowingDay +
                ", returningDay=" + returningDay +
                '}';
    }
}
