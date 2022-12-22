public class OvningFyra {
    public static void main(String[] args) throws InterruptedException {
        
        Thread t1 = new Thread(()->{
            while(true){
                System.out.println("Hello World");
            }
        });

        t1.setDaemon(true);

        t1.start();
        
        Thread.sleep(500);
        
    }
}
