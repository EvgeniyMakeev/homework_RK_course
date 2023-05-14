package library;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library{

    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book one = new Book(25, "Властелин колец", Genre.FANTASY);
        myLibrary.addBook(one);
        Book sec = new Book(12, "Над пропастью во ржи", Genre.NOVEL);
        myLibrary.addBook(sec);
        Book tri = new Book(1, "Шерлок Холмс", Genre.DETECTIVE);
        myLibrary.addBook(tri);
        myLibrary.getBooks();
        myLibrary.deleteBook(12);
        myLibrary.getBooks();
        myLibrary.editBook(25, Genre.NOVEL);
        myLibrary.getBooks();
        myLibrary.editBook(25, "Властелин колец Том 1", Genre.FANTASY);
        myLibrary.getBooks();
    }

    private List<Book> books = new ArrayList<>();
    private Set<Integer> idSet = new HashSet<>();

    public Library() {
    }

    public void getBooks() {
        if (books.isEmpty()) {
            System.out.println("В библиотеке нет ни одной книги.");
        } else {
            books.sort(Book::compareTo);
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i));
            }
        }
    }
    public void getBooksRevers() {
        if (books.isEmpty()) {
            System.out.println("В библиотеке нет ни одной книги.");
        } else {
            books.sort(Book::compareTo);
            for (int i = books.size() - 1; i >= 0; i--) {
                System.out.println(books.get(i));
            }
        }
    }
    public void getBooksLastAdd() {
        if (books.isEmpty()) {
            System.out.println("В библиотеке нет ни одной книги.");
        } else {
            for (int i = books.size() - 1; i >= 0; i--) {
                System.out.println(books.get(i));
            }
        }
    }

    public void addBook(Book book) {
        if (!idSet.contains(book.getId())){
            idSet.add(book.getId());
            books.add(book);
        } else {
            System.out.println("Книга с таким ID уже есть в библиотеке.");
        }
    }
    public void deleteBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                System.out.println("Книга с ID: " + id + " успешно удалена.");
            }
        }
    }

    public void editBook(int id, String title, Genre genre) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(title);
                book.setGenre(genre);
                System.out.println("Книга с ID: " + id + " успешно изменена.");
            }
        }
    }

    public void editBook(int id, String title) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(title);
                System.out.println("Книга с ID: " + id + " успешно изменена.");
            }
        }
    }

    public void editBook(int id, Genre genre) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setGenre(genre);
                System.out.println("Книга с ID: " + id + " успешно изменена.");
            }
        }
    }
}
