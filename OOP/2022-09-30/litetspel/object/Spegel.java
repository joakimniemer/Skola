package litetspel.object;

import litetspel.misc.Interactive;

public class Spegel implements Interactive {

    @Override
    public void interact(Player player) {
        System.out.printf("Du ser %s i spegeln!%n", player.getName());

    }

}
