package gamers;

import main.Pair;
import main.PhysicalObject;
import main.Unit;

import java.util.Random;

public class s24307 extends Unit {

    public s24307(String id, Pair<Double, Double> position, double rotate, CollisionModel model) {
        super(id, position, rotate, model);
    }

    @Override
    public void run() {
        this.enableMovement();
        this.enableStopOnWall();
        while (true) {
            this.rotateRight();
            this.forward();
            if (nearestCollision() > 0 && whatIsInRange() == 0) {
                this.stopRotate();
            }

            if (whatIsInRange() == 3) {
                this.attackInNextMove();
            }
            atakujJesliMozesz();
        }

    }

    void atakujJesliMozesz() {
        while (this.whatIsInRange() == 3)
            this.attackInNextMove();
    }
}
