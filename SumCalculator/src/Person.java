public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen()
    {
        if(age<20&&age>12)
            return true;
        return false;
    }
    public String getFullName()
    {   if(firstName.isEmpty()&&lastName.isEmpty())
           return "";
        if (firstName.isEmpty())
            return lastName;
        if(lastName.isEmpty())
            return firstName;

        return(firstName+" "+lastName)
    }
}