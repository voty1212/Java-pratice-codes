public class Interupted extends Thread {
    public void run() {
        try {
            Thread.sleep(100000);
            System.out.println("Hi");
        } catch (Exception e) {
            System.out.println("Interrupter" + e);
        }
    }
}
