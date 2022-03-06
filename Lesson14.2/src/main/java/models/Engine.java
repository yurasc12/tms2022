package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Двигатель(тип двигателя, количество цилиндров)
 */
@Setter
@Getter
@Builder
@ToString
public class Engine implements Serializable {
    private String type;
    private transient int numberCylinders;

/*    public Engine(String type, int numberCylinders) {
        this.type = type;
        this.numberCylinders = numberCylinders;
    }*/
}
