package service;

import models.library.Book;
import models.library.EmailAddress;
import models.library.Library;
import models.library.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainLibrary {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Reader> readers = new ArrayList<>();

        Library library = new Library(books, readers);

        if (library.openLibrary()) {
            System.out.println("Библиотека открыта");
            Book book = new Book("Болдинская осень", "Пушкин Александр Сергеевич", 1955);
            library.appendBook(book);
            Book book1 = new Book("Бородино", "Лермонтов Михаил Юрьевич", 1999);
            library.appendBook(book1);

            System.out.println(library.getListBook(1));
            System.out.println(library.getListBook(2));
            System.out.println(library.getListBook(3));

            EmailAddress emailAddress = new EmailAddress("mail@mail.ru", "!!!!!!!!!!!");
            Reader reader = new Reader(1, "Петров Петр Петрович", emailAddress, false);
            library.appendReader(reader);

            List<Book> booksReader = new ArrayList<>();
            booksReader.add(book);
            reader.setBooks(booksReader);

            EmailAddress emailAddress1 = new EmailAddress("mail@gmail.com", "!!!!!!!!!!!");
            Reader reader1 = new Reader(2, "Иванов Иван Иваныч", emailAddress1, false);
            library.appendReader(reader1);

            List<Book> booksReader1 = new ArrayList<>();
            booksReader1.add(book1);
            booksReader1.add(book);
            booksReader1.add(book1);
            reader1.setBooks(booksReader1);

            EmailAddress emailAddress2 = new EmailAddress("mail_mail@gmail.com", "!!!!!!!!!!!");
            Reader reader2 = new Reader(3, "Александров Александр Александрович", emailAddress2, true);
            library.appendReader(reader2);

            List<Book> booksReader2 = new ArrayList<>();
            booksReader2.add(book1);
            reader2.setBooks(booksReader2);


            System.out.println();

            Map<String, String> nameEmails = library.getAllDistributionList();
            if (nameEmails != null) {
                nameEmails.forEach((x, y) -> System.out.println(x + " " + y));
            }


            System.out.println();
            Map<String, String> nameEmails1 = library.getDistributionListFlag();
            if (nameEmails1 != null) {
                nameEmails1.forEach((x, y) -> System.out.println(x + " " + y));
            }

            library.getIsUsedBooksList().forEach(System.out::println);


            List<Book> booksAuthor = library.getListReadersBooksByAuthor("Лермонтов Михаил Юрьевич");

            System.out.println();
            System.out.println("Книги на руках :");
            booksAuthor.forEach(p -> System.out.println("Название книги : " + p.getTitle() + " год издания: " + p.getYearPublishing()));

            int countBooksIsUsed = library.getCountBooksIsUsed();
            System.out.println("Максимальное число книг на руках: " + countBooksIsUsed);
            System.out.println();
            library.getGroupReaders();
        }

    }

}


