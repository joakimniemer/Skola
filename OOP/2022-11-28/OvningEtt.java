public class OvningEtt {

    private static class printHello implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }

        }

    }

    public static void main(String[] args) throws InterruptedException {

        printHello pw = new printHello();
        Thread t1 = new Thread(pw);

        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("World");
        }

        t1.join();

        System.out.println("Time to quit!");

    }
}