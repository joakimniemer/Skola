import java.util.concurrent.*;

import se.yrgo.walkfighters.Direction;
import se.yrgo.walkfighters.Walker;


public class RunningBob implements Walker {
    private int midX;
    private int midY;
    private int sizeY;
    private int sizeX;

    @Override
    public void setSize(int x, int y) {
        sizeX = x;
        sizeY = y;
        midX = x / 2;
        midY = y / 2;
    }

    @Override
    public String getName() {
        return "Running Bob";
    }

    @Override
    public Direction nextStep(int x, int y) {
        if (midX == x && midY == y) {
            midX = ThreadLocalRandom.current().nextInt(sizeX);
            midY = ThreadLocalRandom.current().nextInt(sizeY);
        }

        if (y < midY) {
            return Direction.DOWN;
        }
        
        if (x < midX) {
            return Direction.RIGHT;
        }

        if (y > midY) {
            return Direction.UP;
        }

        if (x > midX) {
            return Direction.LEFT;
        }

        return Direction.values()[ThreadLocalRandom.current().nextInt(Direction.values().length)];
    }
}
