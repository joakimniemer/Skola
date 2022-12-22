import java.util.concurrent.ThreadLocalRandom;

public class PlayerCharacter {

    private enum Klass {
        Barbarian, Bard, Cleric, Paladin, Wizard;
    }

    private String name;
    private Klass klass;
    private int strength;
    private int constitution;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;

    PlayerCharacter() {
    }

    public static PlayerCharacter randomCharacter(String name) {
        var player = new PlayerCharacter();
        int[] randomNumbers = player.generateNumbers();

        player.name = name;
        player.klass = player.generateKlass(randomNumbers[0]);
        player.strength = randomNumbers[1];
        player.constitution = randomNumbers[2];
        player.dexterity = randomNumbers[3];
        player.intelligence = randomNumbers[4];
        player.wisdom = randomNumbers[5];
        player.charisma = randomNumbers[6];
        return player;
    }

    private int[] generateNumbers() {
        int[] randomNumbers = new int[7];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(17) + 3;
        }

        return randomNumbers;
    }

    private PlayerCharacter.Klass generateKlass(int randomNumber) {
        if (randomNumber < 6) {
            return PlayerCharacter.Klass.Barbarian;
        }
        if (randomNumber < 9) {
            return PlayerCharacter.Klass.Bard;
        }
        if (randomNumber < 12) {
            return PlayerCharacter.Klass.Cleric;
        }
        if (randomNumber < 15) {
            return PlayerCharacter.Klass.Paladin;
        }
        return PlayerCharacter.Klass.Wizard;
    }

    public String getName() {
        return name;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getStrength() {
        return strength;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    @Override
    public String toString() {
        return String.format(
                "Player %s of class %s has %d strength, %d constitution, %d dexterity, %d intelligence, %d widsom, %d charisma",
                this.name, this.klass, this.strength, this.constitution, this.dexterity, this.intelligence, this.wisdom,
                this.charisma);
    }

}

// varför är ditt enum private? skall man inte kunna hantera klassen utanför?
// du saknar en vettig konstruktor
// poäng: 10 - 1 - 2 = 7p

// .values() för ditt enum hade hjälp med slumpen
// ditt slumpande är inte snyggt. väldigt felbenäget.
