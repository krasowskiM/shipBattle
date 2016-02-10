package shipsEtc;

/**
 * Created by Maciek on 2016-02-10.
 */
public class Missile implements MissileInterface {
    public String type;
    public int velocity;

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void onHit() {
    }
}
