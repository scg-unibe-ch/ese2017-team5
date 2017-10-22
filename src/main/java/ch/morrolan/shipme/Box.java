package ch.morrolan.shipme;

/**
 * Created by pascal on 22.10.17.
 */
public class Box implements ITruck {
    private static int counter = 0;

    //Amount of palettes that fit into the Trailer
    private final int SCANIA_AMOUNT = 18;

    //Weight of the Trailer in tons
    private final float SCANIA_WEIGHT = (float)12;

    private BoxModel model;
    private int id;
    private int paletteAmount;
    private float weight;

    public Box(BoxModel model)
    {
        counter++;
        this.id = counter;
        this.model = model;
        if(model == BoxModel.Scania)
        {
            this.paletteAmount = SCANIA_AMOUNT;
            this.weight = SCANIA_WEIGHT;
        }
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public IModel getModel() {
        return this.model;
    }

    @Override
    public int getPaletteAmount() {
        return this.paletteAmount;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }
}
