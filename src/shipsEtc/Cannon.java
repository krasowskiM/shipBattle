package shipsEtc;


import java.util.Timer;

/**
 * Created by Maciek on 2016-02-10.
 */
public class Cannon {
    private int caliber;
    private int loader=0;
    private Missile missile;
    private APMissile apMissile;
    private HEMissile heMissile;
    Timer timer = new Timer();

    public void load(Missile missile, int loader){
            loader++;
    }

    public void fireMissile(Missile missile){
            missile.setVelocity(100);
    }

    public int getCaliber() {
        return caliber;
    }
}
