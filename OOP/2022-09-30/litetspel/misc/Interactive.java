package litetspel.misc;

import litetspel.object.Player;

public interface Interactive {
   Player player = new Player();

   void interact(Player player);

   default String getName() {
      return String.valueOf(player.getName());
   }
}
