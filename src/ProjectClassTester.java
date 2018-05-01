public class ProjectClassTester {
    public static void main(String[] args) {
        ProjectClass project = new ProjectClass();
        ProjectClass project2 = new ProjectClass("My project");
        ProjectClass project3 = new ProjectClass();

        System.out.println(project3.getDescription());

        //start a new portfolio

        ProjectPortfolioClass portfolio = new ProjectPortfolioClass();
        portfolio.getProjects();
        portfolio.addProject(new ProjectClass());
        portfolio.addProject(new ProjectClass());
        portfolio.addProject(new ProjectClass());
        System.out.println(portfolio.getProjects());

        System.out.println("TOTal cost: " + portfolio.getPortfolioCost());
        System.out.printf("%nTOTal cost: $%.2f",portfolio.getPortfolioCost());



    }

}
