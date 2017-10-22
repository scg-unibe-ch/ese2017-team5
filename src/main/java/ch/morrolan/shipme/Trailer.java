package ch.morrolan.shipme;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by pascal on 22.10.17.
 */
public class Trailer implements ITruck {

    //Amount of palettes that fit into the Trailer
    private final int KOEGEL_AMOUNT = 32;
    private final int SCHMITZ_AMOUNT = 34;
    private final int SCHWARZMÜLLER_AMOUNT = 34;

    //Weight of the Trailer
    private final float KOEGEL_WEIGHT = (float)24.5;
    private final float SCHMITZ_WEIGHT = (float)25;
    private final float SCHWARZMÜLLER_WEIGHT = (float)25;

    private TrailerModel model;
    private int paletteAmount;
    private float weight;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    public Trailer(TrailerModel model)
    {
        assert model != null;
        this.model = model;
        if(this.model == TrailerModel.Koegel)
        {
            this.paletteAmount = KOEGEL_AMOUNT;
            this.weight = KOEGEL_WEIGHT;
        }
        else if (this.model == TrailerModel.Schmitz)
        {
            this.paletteAmount = SCHMITZ_AMOUNT;
            this.weight = SCHMITZ_WEIGHT;
        }

        else
        {
            this.paletteAmount = SCHWARZMÜLLER_AMOUNT;
            this.weight = SCHWARZMÜLLER_WEIGHT;
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
