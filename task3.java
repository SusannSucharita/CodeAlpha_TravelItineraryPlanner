import java.util.ArrayList;
import java.util.Scanner;
public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Destination> destinations = new ArrayList<>();
        double totalBudget = 0.0;
        while (true) {
            System.out.println("Travel Itinerary Planner");
            System.out.println("1. Add Destination");
            System.out.println("2. View Itinerary");
            System.out.println("3. Calculate Total Budget");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter destination: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter start date (YYYY-MM-DD): ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter end date (YYYY-MM-DD): ");
                    String endDate = scanner.nextLine();
                    System.out.print("Enter estimated cost: ");
                    double cost = scanner.nextDouble();
                    scanner.nextLine(); 
                    destinations.add(new Destination(name, startDate, endDate, cost));
                    totalBudget += cost;
                    break;
                case 2:
                    System.out.println("Itinerary:");
                    for (Destination destination : destinations) {
                        System.out.println(destination);
                    }
                    break;
                case 3:
                    System.out.printf("Total Budget: %.2f\n", totalBudget);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
class Destination {
    private String name;
    private String startDate;
    private String endDate;
    private double cost;
    public Destination(String name, String startDate, String endDate, double cost) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
    }
    public String toString() {
        return "Destination: " + name + ", Start Date: " + startDate + ", End Date: " + endDate + ", Cost: " + cost;
    }
}