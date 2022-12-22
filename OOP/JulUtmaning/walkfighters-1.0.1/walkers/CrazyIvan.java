import java.util.concurrent.*;

import se.yrgo.walkfighters.Direction;
import se.yrgo.walkfighters.Walker;

public class CrazyIvan implements Walker {
    private enum State {
        NORMAL, TURNING
    }

    private State state = State.NORMAL;
    private int turnCount = 0;

    @Override
    public String getName() {
        return "Crazy Ivan";
    }
    
    @Override
    public Direction nextStep(int x, int y) {
        if (ThreadLocalRandom.current().nextInt(10) == 0) {
            state = State.TURNING;
            turnCount = 0;
        }

        if (state == State.NORMAL) {
            // normal random walk
            Direction[] values = Direction.values();
            int index = ThreadLocalRandom.current().nextInt(values.length);
            return values[index];
        }
        else {
            turnCount++;

            // do a turn
            if (turnCount < 4) {
                return Direction.LEFT;
            }
            else if (turnCount < 7) {
                 return Direction.UP;
            }
            else if (turnCount < 10) {
                 return Direction.RIGHT;
            }
            else if (turnCount < 12) {
                 return Direction.DOWN;
            }
            else {
                state = State.NORMAL;
                return Direction.DOWN;
            }
        }
    }
}
