package problem4;

public class Project {
    private String name;
    private double budget;
    private Lecturer leader;
    private final int MAX_MEMBERS = 10;
    private Lecturer[] memberList;
    private int memberCount = 0;

    public Project(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.memberList = new Lecturer[MAX_MEMBERS];
    }

    public Project(){
        this.name = "Default";
        this.budget = 0;
        this.memberList = new Lecturer[MAX_MEMBERS];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Lecturer getLeader() {
        return leader;
    }

    public void setLeader(Lecturer leader) {
        this.leader = leader;
    }

    public boolean addMember(Lecturer lec){
        if(memberCount < MAX_MEMBERS){
            memberList[memberCount] = lec;
            memberCount++;
            return true;
        }
        return false;
    }

    public void displayMember(){
        System.out.println("Leader, " + this.leader);
        for(int i = 0; i < memberCount; i++){
            System.out.printf("Member #%s, %s\n", i, memberList[i]);
        }
    }
}
