package ch.morrolan.shipme;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * Simulates a Vehicle
 */
public class VehicleType {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int weight;
    private String model;
    private int paletteAmount;
    private boolean canDrive;

    public VehicleType(String model, int weight, int paletteAmount, boolean canDrive)
    {
        this.model = model;
        this.weight = weight;
        this.paletteAmount = paletteAmount;
        this.canDrive = canDrive;
    }
}
