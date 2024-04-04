public class FullTimeStudent extends Student{
    private Project joinedResearch;

    public FullTimeStudent(){
        super();
        this.joinedResearch = null;
    }

    public FullTimeStudent(String name, String major, String id) {
        super(name, major, id);
        this.joinedResearch = null;
    }

    public FullTimeStudent(String name, String major, String id, Project joinedResearch){
        super(name, major, id);
        this.joinedResearch = joinedResearch;
    }

    public Project getJoinedResearch() {
        return joinedResearch;
    }
    public boolean joinProject(){
        
    }
    @Override
    public String toString(){
        return String.format("FullTimeStudent{name='%s', major='%s'. id='%s'}",
                this.getName(), this.getMajor(), this.getId());
    }
}
