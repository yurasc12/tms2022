package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
public class FuelTank implements Serializable {
    private String typeFuel;
    private double volume;

/*    public FuelTank(String typeFuel, double volume) {
        this.typeFuel = typeFuel;
        this.volume = volume;
    }*/
}
