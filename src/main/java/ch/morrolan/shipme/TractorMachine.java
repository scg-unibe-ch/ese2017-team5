package ch.morrolan.shipme;

/**
 * Created by pascal on 22.10.17.
 */
public class TractorMachine implements ITruck {
    private static int counter = 0;
    private int id;
    private float weight;
    private TractorMachineModel model;

    public TractorMachine(TractorMachineModel model)
    {
        counter++;
        this.id = counter;
        this.model = model;
        this.weight = 0;
    }

    public TractorMachine(TractorMachineModel model, float weight)
    {
        this(model);
        this.weight = weight;
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
        return 0;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }
}
