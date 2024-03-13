package problem4;

public class SchoolSystem {
    public static void main(String[] args) {
        Lecturer lec1 = new Lecturer("R01", "Ling Huo Chong", "Senior Lecturer");
        Lecturer lec2 = new Lecturer("R02", "Minh Thanh Vu", "Associate Lecturer");
        Lecturer lec3 = new Lecturer("R03", "Carol", "Lecturer");

        Project p1 = new Project("Project1", 1000);
        Project p2 = new Project("Project2", 200);

        // Must return true;
        boolean b = lec1.leadProject(p1);
        System.out.println(b);

        // Must return false since p1 has a leader
        b = lec2.leadProject(p1);
        System.out.println(b);

        // Must return false since lec1 is leading p1
        b = lec1.leadProject(p2);
        System.out.println(b);

        // Must display lecturer1 as a leader and lecturer2 and lecturer3 as members
        lec2.joinProject(p1);
        lec3.joinProject(p1);
        p1.displayMember();
    }
}
