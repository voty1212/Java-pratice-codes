public class Deadlock {
    private static Object l1=new Object();
    private static Object l2=new Object();

    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (l1){
                    System.out.println("l1");
                    try
                    {
                        Thread.sleep(10000);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    synchronized (l2){
                        System.out.println("l2");
                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (l2){
                    System.out.println("l2");
                    try
                    {
                        Thread.sleep(10000);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    synchronized (l1){
                        System.out.println("l1");
                    }
                }
            }
        });
        t1.start();
        t2.start();

    }
}
