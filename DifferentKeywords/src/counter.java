public class counter {

    //Static is used to create a variable which is exclusive to the class
        static int m=0;
        public counter(){
            m++;
        }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new counter();
        }
        System.out.println(m);
    }

}