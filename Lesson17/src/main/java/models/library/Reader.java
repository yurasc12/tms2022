package models.library;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Reader {
    private int id;
    private String fullName;
    private EmailAddress email;
    private List<Book> books;
    private boolean broadcastFlag;

    public Reader(int id, String fullName, EmailAddress email, boolean broadcastFlag) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.broadcastFlag = broadcastFlag;
    }

}
