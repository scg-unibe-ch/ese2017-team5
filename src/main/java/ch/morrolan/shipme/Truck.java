package ch.morrolan.shipme;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by pascal on 22.10.17.
 * A Truck is a TractorMachine and a trailer
 */
public class Truck implements ITruck{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private TractorMachine machine;
    private Trailer trailer;

    public Truck(TractorMachine machine, Trailer trailer)
    {
        assert (machine != null && trailer != null);
        this.machine = machine;
        this.trailer = trailer;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public IModel getModel() {
        return null;
    }

    @Override
    public int getPaletteAmount() {
        return this.trailer.getPaletteAmount();
    }

    @Override
    public float getWeight() {
        return this.trailer.getWeight() + this.machine.getWeight();
    }
}
