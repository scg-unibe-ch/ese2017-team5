package ch.morrolan.shipme;

/**
 * Created by pascal on 22.10.17.
 */
public class Van implements ITruck {

    private static int counter = 0;
    //Amount of palettes that fit into the Van
    private final int VW_AMOUNT = 1;

    //Weight of the Trailer in tons
    private final float VW_WEIGHT = (float)1;

    private VanModel model;
    private int paletteAmount;
    private float weight;
    private int id;

    public Van(VanModel model)
    {
        counter++;
        this.id = counter;
        this.model = model;
        if(this.model == VanModel.VW)
        {
            this.paletteAmount = VW_AMOUNT;
            this.weight = VW_WEIGHT;
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
