package shipsEtc;

/**
 * Created by Maciek on 2016-02-10.
 */
public class APMissile implements MissileInterface {
    public String type = "AP";
    public int baseDmg=1000;
    public int dmg;
    public int basePenetrationPower=3;
    public Missile missile;
    public Cannon cannon;
    public Ship shipFired;


    @Override
    public void onHit() {
        dmg = baseDmg * cannon.getCaliber() * penetrationChance();
        shipFired.setHullPoints(shipFired.getHullPoints() - dmg);
    }

    private boolean ricochet(){
        if (shipFired.getArmorThickness()<=basePenetrationPower*missile.getVelocity()
                && shipFired.getArmorThickness()>=basePenetrationPower){
            return false;
        }else {
            return true;
        }
    }

    private int penetrationChance(){
        if (ricochet()==true){
            return 3;
        }else
            return 0;
    }
}
