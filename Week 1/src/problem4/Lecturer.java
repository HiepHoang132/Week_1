package problem4;

public class Lecturer {
    private String employeeID;
    private String fullName;
    private String rank;
    private Project ledProject;
    private final int MAX_PROJECTS = 10;
    private Project[] joinProjects;
    private int projectCount = 0;

    public Lecturer(String employeeID, String fullName, String rank) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.rank = rank;
        this.joinProjects = new Project[MAX_PROJECTS];
    }

    public Lecturer(){
        this.employeeID = "Default";
        this.fullName = "Default";
        this.rank = "Default";
        this.joinProjects = new Project[MAX_PROJECTS];
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRank() {
        return rank;
    }

    public boolean setRank(String rank) {
        String[] ranks = {"Associate Lecturer", "Lecturer", "Senior Lecturer"};
        boolean checked = false;
        for(String r: ranks){
            if(rank.equals(r)){
                checked = true;
                break;
            }
        }
        if(checked){
            this.rank = rank;
            return true;
        }
        return false;
    }

    public boolean joinProject(Project p){
        if(projectCount < MAX_PROJECTS && p.addMember(this)){
            this.joinProjects[projectCount] = p;
            projectCount++;
            return true;
        }
        return false;
    }
    public boolean leadProject(Project p){
        if(!isLeading() && p.getLeader() == null){
            this.ledProject = p;
            p.setLeader(this);
            return true;
        }
        return false;
    }

    public boolean isLeading(){
        return this.ledProject != null;
    }

    @Override
    public String toString(){
        return String.format("Lecturer ID: %s, Lecturer's name: %s, Rank: %s", this.getEmployeeID(), this.getFullName(), this.getRank());
    }
}
