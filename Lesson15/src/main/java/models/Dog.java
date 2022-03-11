package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Dog extends Animals implements Serializable {
    public String name;

    public Dog() {
    }
}
