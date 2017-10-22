package ch.morrolan.shipme;

/**
 * Created by pascal on 22.10.17.
 * A Truck is a TractorMachine and a trailer
 */
public class Truck implements ITruck{
    private static int counter = 0;
    private int id;
    private TractorMachine machine;
    private Trailer trailer;

    public Truck(TractorMachine machine, Trailer trailer)
    {
        assert (machine != null && trailer != null);
        counter++;
        this.id = counter;
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
