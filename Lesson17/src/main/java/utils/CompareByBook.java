package utils;

import models.library.Book;

import java.util.Comparator;

public class CompareByBook {


    public static Comparator<Book> AuthorTitleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {

            int flag = book1.getAuthor().compareTo(book2.getAuthor());

            // если получили 0, то сортируем по году издания
            if (flag == 0) flag = book1.getTitle().compareTo(book2.getTitle());
            return flag;
        }
    };
    public static Comparator<Book> AuthorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
    };

    public static Comparator<Book> YearPublishingComparator = new Comparator<Book>() {
        @Override
        public int compare(Book book1, Book book2) {
            return book1.getYearPublishing() - (book2.getYearPublishing());
        }
    };
}
