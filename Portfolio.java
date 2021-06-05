import java.util.ArrayList;

public class Portfolio{
    
    private ArrayList<Project> projects = new ArrayList<Project>();

    public Portfolio(){}

    public Portfolio(ArrayList<Project> projects){
        this.projects = projects;
    }

    public ArrayList<Project> getProjects(){
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public void addproject(Project project){
        projects.add(project);
    }

    public double getPortfolioCost(){
        double total = 0;
        for(Project project : projects) {
            total += project.getinitialCost();
        }
        return total;
    }

    public void showPortfolio(){
        for (Project project : projects) {
            System.out.println(project.elevatorPitch());
        }
    }

    
    
}