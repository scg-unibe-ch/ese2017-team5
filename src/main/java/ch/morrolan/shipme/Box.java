package ch.morrolan.shipme;

/**
 * Created by pascal on 22.10.17.
 */
public class Box implements ITruck {
    //Amount of palettes that fit into the Trailer
    private final int SCANIA_AMOUNT = 18;

    //Weight of the Trailer in tons
    private final float SCANIA_WEIGHT = (float)12;

    private BoxModel model;
    private int paletteAmount;

}
