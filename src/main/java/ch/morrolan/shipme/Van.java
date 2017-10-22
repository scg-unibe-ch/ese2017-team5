package ch.morrolan.shipme;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by pascal on 22.10.17.
 */
public class Van implements ITruck {
    //Amount of palettes that fit into the Van
    private final int VW_AMOUNT = 1;

    //Weight of the Trailer in tons
    private final float VW_WEIGHT = (float)1;

    private VanModel model;
    private int paletteAmount;
    private float weight;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    public Van(VanModel model)
    {
        assert model != null;
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
