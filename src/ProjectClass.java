public class ProjectClass {
    private String project_name;
    private String description;
    private double total_cost;

    public double getInitial_cost() {
        return initial_cost;
    }

    public void setInitial_cost(double initial_cost) {
        this.initial_cost = initial_cost;
    }

    private double initial_cost;

    ProjectClass() {
        this("Blank canvas", "There is no spoon", 25);
    }

    ProjectClass(String project_name) {
        this(project_name, "Holding this place for a friend", 25);
    }

    ProjectClass(String project_name, String description, double initial_cost) {
        this.project_name = project_name;
        this.description = description;
        this.initial_cost = initial_cost;
        this.total_cost = initial_cost;
    }


    public String getName() {
        return project_name;
    }

    public void setName(String project_name) {
        this.project_name = project_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {

    }


    public double getCost() {
        return this.total_cost;
    }

    @Override
    public String toString() {
        return this.project_name;
    }
}
