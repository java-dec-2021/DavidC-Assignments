import java.util.ArrayList;
public class Portfolio {
    public static ArrayList<Project> projects = new ArrayList<Project>();
    
    //calculates and returns the cost to buy the entire portfolio
    public static double getPortfolioCost() {
        double totalCost = 0;
        for (Project project : projects) {
            totalCost += project.getCost();
        }
        return totalCost;
    }
    
    //print all the project elevator pitches, followed by the total cost
    public static void showPortfolio() {
        System.out.println("All Projects");
        for (Project project : projects) {
            System.out.println(project.elevatorPitch());
        }
        
        System.out.println("Total Cost: $"+ String.format("%.2f",Portfolio.getPortfolioCost()));
    }
}
