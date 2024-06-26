package lms;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name, surname, personalNumber;
    private List<Book> borrowedBooks;



    public Student(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
        this.borrowedBooks = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void addBorrowedBook(Book book) { borrowedBooks.add(book);
    }
}
