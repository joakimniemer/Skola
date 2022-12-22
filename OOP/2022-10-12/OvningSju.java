public class OvningSju {
    public static void main(String[] args) {

        long timeOne = 0;
        long timeTwo = 0;
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            try {
                timeOne = System.currentTimeMillis();
                doImportantStuff();
                timeTwo = System.currentTimeMillis();
            } finally {
                System.out.println("Det tog " + (timeTwo - timeOne) + "ms");
            }
        }

    }

    public static void doImportantStuff() {
        int roll = 100 / (int) (Math.random() * 3);
        for (int i = 0; i < roll; ++i) {
            System.out.println("Rolling...");
        }
    }

}
