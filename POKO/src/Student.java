public class Student {
    private String id;
    private String name;
    private String DOB;
    private String classlist;


    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", classlist='" + classlist + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getClasslist() {
        return classlist;
    }

    public void setClasslist(String classlist) {
        this.classlist = classlist;
    }

    public Student(String id, String name, String DOB, String classlist) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.classlist = classlist;
    }
}
