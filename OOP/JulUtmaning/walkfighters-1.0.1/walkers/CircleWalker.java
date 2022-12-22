import java.util.concurrent.*;

import se.yrgo.walkfighters.Direction;
import se.yrgo.walkfighters.Walker;

public class CircleWalker implements Walker {
    private Direction current = null;
    private int currentMax = 1;
    private int count = 0;

    @Override
    public String getName() {
        return "Cirque du Grid";
    }

    @Override
    public Direction nextStep(int x, int y) {
        if (current == null) {
            Direction[] values = Direction.values();
            int num = ThreadLocalRandom.current().nextInt(values.length);
            current = values[num];
        }
        else if (count == currentMax) {
            count = 0;

            switch (current) {
                case DOWN:
                    current = Direction.LEFT;
                    break;
                case LEFT:
                    current = Direction.UP;
                    currentMax++;
                    break;
                case UP:
                    current = Direction.RIGHT;
                    currentMax++;
                    break;
                default:
                    current = Direction.DOWN;
                    currentMax++;
            }
        }
        
        count++;
        
        return current;
    }
}
