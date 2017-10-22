package ch.morrolan.shipme;

/**
 * Created by pascal on 22.10.17.
 */
public interface ITruck {
    public int getID();
    public IModel getModel();
    public int getPaletteAmount();
    public float getWeight();
}
