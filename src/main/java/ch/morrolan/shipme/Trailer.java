package ch.morrolan.shipme;

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

}
