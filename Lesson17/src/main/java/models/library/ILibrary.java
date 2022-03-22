package models.library;

import java.util.List;
import java.util.Map;

public interface ILibrary {
    // получить список
    List<Book> getListBook(int type);

    // получить список раассылки
    Map<String, String> getAllDistributionList();

    //получить список рассылки согласно флага согласия
    Map<String, String> getDistributionListFlag();

    // получить список уникальных книг на руках
    List<Book> getIsUsedBooksList();

    //найти держателей книг определенного автора
    List<Book> getListReadersBooksByAuthor(String author);


    // Максимальное число книг наруках у читателя
    int getCountBooksIsUsed();

    //Группировка читателей
    //List<Reader> getGroupReaders();
    Map<Boolean, List<EmailAddress>> getGroupReaders();

    // поступление книг
    boolean appendBook(Book book);

    // открыть библиотеку
    boolean openLibrary();

    // Завести читателя
    boolean appendReader(Reader reader);

}
