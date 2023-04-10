public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employee_No=1;

    public Employee(String name, String DOB, String hireDate) {
        super(name, DOB);
        this.employeeId = Employee.employee_No++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
