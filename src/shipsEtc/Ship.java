package shipsEtc;

/**
 * Created by Maciek on 2016-02-10.
 */
public class Ship implements ShipInterface{
    private String name;
    private int hullPoints;
    private int velocity;
    private int armorThickness;

    @Override
    public void fire() {


    }

    @Override
    public void sail() {

    }

    public int getArmorThickness() {
        return armorThickness;
    }

    public void setArmorThickness(int armorThickness) {
        this.armorThickness = armorThickness;
    }

    public int getHullPoints() {
        return hullPoints;
    }

    public void setHullPoints(int hullPoints) {
        this.hullPoints = hullPoints;
    }
}
