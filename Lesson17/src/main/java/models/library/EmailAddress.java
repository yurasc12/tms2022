package models.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class EmailAddress {
    private String email;
    private String information;

}
