public class OvningTva {
    
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        });

        // Sätt att lösa det med statisk metod
        // Thread t2 = new Thread(OvningTva::printMethod);
        
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("World");
        }

        t1.join();

        System.out.println("Time to quit!");

    }

    // Sätt att lösa det med statisk metod
    // private static void printMethod(){
    //     for (int i = 0; i < 10; i++) {
    //         System.out.println("Hello");
    //     }
    // }
}

