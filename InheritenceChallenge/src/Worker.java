public class Worker {
    private String name;
    private String DOB;
    private String ED;
    public int getAge()
    {
        int currentYear=2023;
        int by=Integer.parseInt(DOB.substring(6));
        return currentYear-by;
    }
    public double collectPay(){
        return 0;
    }
    public void terminate(String ED){
this.ED=ED;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", ED='" + ED + '\'' +
                '}';
    }

    public Worker(String name, String DOB) {
        this.name = name;
        this.DOB = DOB;
    }
}
