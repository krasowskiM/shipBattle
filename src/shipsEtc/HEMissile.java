package shipsEtc;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Maciek on 2016-02-10.
 */
class HEMissile extends Missile {
    private String type="HE";
    private int baseDmg=1100;
    private int dmg;
    private double baseSetOnFireChance=Math.random();
    public Cannon cannon;
    public Ship shipFired;
    Timer timer = new Timer();

    @Override
    public void onHit() {
        dmg = baseDmg * cannon.getCaliber();
        shipFired.setHullPoints(shipFired.getHullPoints() - dmg);
        if (baseSetOnFireChance <= 0.1){
            timer.scheduleAtFixedRate(new TimerTask(){
                @Override
                public void run(){
                    setOnFire();
                }
            }, 0, 10000);
        }
        }

    private void setOnFire(){
        timer.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                shipFired.setHullPoints(shipFired.getHullPoints()-100);
                System.out.println("Ship is burning! There's "+shipFired.getHullPoints()+" HP left.");
                }
            }, 0, 1000);
        }
    }
