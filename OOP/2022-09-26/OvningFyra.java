public class OvningFyra {
    public static void main(String[] args) {

        game(4);
        game(6);
        game(8);
        game(10);
        game(12);
        game(20);

    }

    public static int game(int sides) {
        GameDie gg = new GameDie(sides);

        do {
            gg.generateDiceRoll();

        } while (gg.getDiceRoll() != gg.getNumberOfSides());

        gg.medianAndNumberOfRolles();
        return gg.getRollCounter();
    }
}
