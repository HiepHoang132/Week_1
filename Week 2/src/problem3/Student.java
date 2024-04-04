public abstract class Student {
    private String name;
    private String major;
    private String id;
    private static int studentCount;

    public Student(){
        name = "Default";
        major = "Default";
        id = "Default";
        studentCount++;
    }

    public Student(String name, String major, String id) {
        this.name = name;
        this.major = major;
        this.id = id;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
