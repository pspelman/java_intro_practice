import java.util.ArrayList;

public class ProjectPortfolioClass {
    private ArrayList<ProjectClass> projects = new ArrayList<>();
    private String portfolio_name;

    public ArrayList<ProjectClass> getProjects() {
        if (this.projects.size() == 0) {
            System.out.println("NO PROJECTS!");
        }
        return this.projects;
    }

//    public void setProjects(ArrayList<ProjectClass> projects) {
//        this.projects = projects;
//    }

    ProjectPortfolioClass() {
        this("new portfolio");
    }

    ProjectPortfolioClass(String portfolio_name) {
        this.portfolio_name = portfolio_name;
    }


    public void addProject(ProjectClass project) {
        this.projects.add(project);
        //        this.projects.add(new ProjectClass());

    }

    public double getPortfolioCost() {
        double total_cost = 0;
        for (ProjectClass project : this.projects) {
            total_cost += project.getCost();
        }
        return total_cost;
    }



}
