public class ProjectTest{

    public static void main(String[] args) {

        Project ball = new Project();
        Project bat = new Project("Bat");
        Project glove = new Project("Glove", "Catch balls.");
        Project base = new Project("Base", "Player will be safe here", 10.99);


        System.out.println(ball.elevatorPitch());
        System.out.println(bat.elevatorPitch());
        System.out.println(glove.elevatorPitch());
        System.out.println(base.elevatorPitch());

        System.out.println("\nSetting values...\n");
        ball.setName("Ball");
        ball.setDescription("A round spehre that you throw");
        ball.setinitialCost(2.99);

        bat.setDescription("Stick that you swing");
        bat.setinitialCost(29.99);

        glove.setinitialCost(19.99);

        System.out.println(ball.elevatorPitch());
        System.out.println(bat.elevatorPitch());
        System.out.println(glove.elevatorPitch());
        System.out.println(base.elevatorPitch());

        System.out.println("\nGetting names...\n");
        
        System.out.println(ball.getName());
        System.out.println(bat.getName());
        System.out.println(glove.getName());
        System.out.println(base.getName());

        System.out.println("\nGetting desciptions...\n");
        
        System.out.println(ball.getDescription());
        System.out.println(bat.getDescription());
        System.out.println(glove.getDescription());
        System.out.println(base.getDescription());

        System.out.println("\nCreating Portfolio...");

        Portfolio projects = new Portfolio();

        projects.addproject(ball);
        projects.addproject(bat);
        projects.addproject(glove);
        projects.addproject(base);

        System.out.println("\nGetting total cost of portfolio...\n");

        double totalCost = projects.getPortfolioCost();
        System.out.println(totalCost);

        System.out.println("\nGetting all elevator pitches...\n");
        projects.showPortfolio();


    }

}