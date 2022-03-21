package models.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@ToString
@AllArgsConstructor
@Getter
public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int yearPublishing;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublishing);
    }

    @Override
    public int compareTo(Book book) {
        int result = this.yearPublishing - book.getYearPublishing();
        return result;
    }


}
