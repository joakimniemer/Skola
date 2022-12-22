import java.util.concurrent.*;

import se.yrgo.walkfighters.Direction;
import se.yrgo.walkfighters.Walker;

public class TryHardWalker implements Walker {
    private int maxX;
    private int maxY;

    @Override
    public String getName() {
        return "Try Hard";
    }

    @Override
    public void setSize(int x, int y) {
        maxX = x;
        maxY = y;
    }

    @Override
    public Direction nextStep(int x, int y) {
        Direction selected;
        do {
            Direction[] values = Direction.values();
            int num = ThreadLocalRandom.current().nextInt(values.length);
            selected = values[num];
        } while (invalid(x, y, selected));

        return selected;
    }

    private boolean invalid(int x, int y, Direction dir) {
        if (x == 0 && dir == Direction.LEFT) {
            return true;
        }

        if (y == 0 && dir == Direction.UP) {
            return true;
        }

        if (x == maxX-1 && dir == Direction.RIGHT) {
            return true;
        }

        if (y == maxY-1 && dir == Direction.DOWN) {
            return true;
        }

        return false;
    }
}
