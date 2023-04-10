public class Main {
    // Runnable runnable=new Runnable() {
//        @Override
//        public void run() {
//            String mystring="Let's split the bill";
//            String[] parts=mystring.split(" ");
//            for (String part:parts){
//                System.out.println(part);
//            }
//
//        }
//    };
    Runnable r2=()->{
        String mystring="Let's split the bill";
        String[] parts=mystring.split(" ");
        for (String part:parts){
            System.out.println(part);
        }
    };
}