public class PartTimeStudent extends Student{
    private double minHour;
    private double maxHour;

    public PartTimeStudent(){
        super();
        this.minHour = 0;
        this.maxHour = 0;
    }

    public PartTimeStudent(String name, String major, String id){
        super(name, major, id);
        this.minHour = 0;
        this.maxHour = 0;
    }

    public PartTimeStudent(String name, String major, String id, double minHour, double maxHour) {
        super(name, major, id);
        this.minHour = minHour;
        this.maxHour = maxHour;
    }

    public double getMinHour() {
        return minHour;
    }

    public void setMinHour(double minHour) {
        this.minHour = minHour;
    }

    public double getMaxHour() {
        return maxHour;
    }

    public void setMaxHour(double maxHour) {
        this.maxHour = maxHour;
    }

    public void registerHour(double minHour, double maxHour){
        this.setMinHour(minHour);
        this.setMaxHour(maxHour);
    }

    @Override
    public String toString(){
        return String.format("PartTimeStudent{name='%s', major='%s'. id='%s', minHour='%s', maxHour='%s'}",
                this.getName(), this.getMajor(), this.getId(), this.getMinHour(), this.getMaxHour());
    }
}
