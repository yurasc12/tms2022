package models.library;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static utils.CompareByBook.AuthorComparator;
import static utils.CompareByBook.AuthorTitleComparator;

/**
 * a) Получить список всех книг библиотеки, отсортированных по году издания.
 * b) Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
 * При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
 * c) Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
 * Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
 * d) Получить список всех книг, взятых читателями.
 * Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
 * e) Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина Александра Сергеевича.
 * <p>
 * <p>
 * <p>
 * a) Узнать наибольшее число книг, которое сейчас на руках у читателя.
 * <p>
 * b) Необходимо рассылать разные тексты двум группам:
 * * тем, у кого взято меньше двух книг, просто расскажем о новинках библиотеки;
 * * тем, у кого две книги и больше, напомним о том, что их нужно вернуть в срок.
 * То есть надо написать метод, который вернёт два списка адресов (типа EmailAddress): с пометкой OK — если книг не больше двух,
 * или TOO_MUCH — если их две и больше. Порядок групп не важен.
 */
@Getter
public class Library implements ILibrary {
    private List<Book> books;
    private List<Reader> readers;
    private boolean openFlag;

    public Library(List<Book> books, List<Reader> readers) {
        this.books = books;
        this.readers = readers;
    }

    public Library() {
    }

    @Override
    public List<Book> getListBook(int type) {
        return switch (type) {
            case 1 -> books.stream()
                    .sorted(AuthorComparator)
                    .collect(Collectors.toList());
            case 2 -> books.stream()
                    .sorted(AuthorTitleComparator)
                    .collect(Collectors.toList());
            case 3 -> books.stream()
                    .sorted(Comparator.comparingInt(Book::getYearPublishing))
                    .collect(Collectors.toList());
            default -> new ArrayList<>();
        };
    }

    @Override
    public Map<String, String> getAllDistributionList() {
        Map<String, String> readersAddress = readers.stream()
                .collect(Collectors.toMap(Reader::getFullName, t -> t.getEmail().getEmail()));
        return readersAddress;
    }

    @Override
    public Map<String, String> getDistributionListFlag() {
        Map<String, String> readersAddress = readers.stream()
                .filter(Reader::isBroadcastFlag)
                .filter(p -> p.getBooks().size() >= 1)
                .collect(Collectors.toMap(Reader::getFullName, t -> t.getEmail().getEmail()));
        return readersAddress;
    }

    @Override
    public List<Book> getIsUsedBooksList() {
        List<Book> books = readers.stream()
                .flatMap((p -> p.getBooks().stream()))
                .distinct()
                .collect(Collectors.toList());
        return books;
    }

    @Override
    public List<Book> getListReadersBooksByAuthor(String author) {
        return readers.stream()
                .flatMap((p -> p.getBooks().stream()))
                .filter(p -> p.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    @Override
    public int getCountBooksIsUsed() {
        if (readers != null) {

            return readers.stream()
                    .max((p1, p2) -> p1.getBooks().size() - p2.getBooks().size())
                    .get()
                    .getBooks().size();
        }
        return 0;
    }

    @Override
    public Map<Boolean, List<EmailAddress>> getGroupReaders() {
        Map<Boolean, List<EmailAddress>> result = readers.stream()
                .collect(Collectors.partitioningBy(p -> p.getBooks().size() < 2, Collectors.mapping(p -> p.getEmail(), Collectors.toList())));
        return result;
    }

    @Override
    public boolean appendBook(Book book) {
        if (openFlag) {
            books.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean openLibrary() {
        if (!openFlag) {
            openFlag = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean appendReader(Reader reader) {
        if (!findByReader(reader.getId())) {
            readers.add(reader);
            return true;
        }
        return false;
    }

    private boolean findByReader(int id) {
        return readers.stream().anyMatch(reader -> reader.getId() == id);
    }

}
