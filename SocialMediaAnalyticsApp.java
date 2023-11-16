import java.util.*;

public class SocialMediaAnalyticsApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            SocialMediaAnalyticsTool analyticsTool = new SocialMediaAnalyticsTool();

            while (true) {
                printMenuOptions();
                int choice = getUserChoice(scanner);

                switch (choice) {
                    case 1:
                        System.out.println("Total Likes: " + analyticsTool.getTotalLikes());
                        break;

                    case 2:
                        System.out.println("Total Comments: " + analyticsTool.getTotalComments());
                        break;

                    case 3:
                        System.out.println("Total Shares: " + analyticsTool.getTotalShares());
                        break;

                    case 4:
                        int topN = getTopNValue(scanner);
                        if (topN > 0) {
                            Map<String, Integer> topUsers = analyticsTool.getTopUsersByLikes(topN);
                            displayTopUsersByLikes(topUsers);
                        }
                        break;

                    case 5:
                        System.out.println("Exiting the Social Media Analytics Tool. Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


    private static void printMenuOptions() {
        System.out.println("1. Total Likes");
        System.out.println("2. Total Comments");
        System.out.println("3. Total Shares");
        System.out.println("4. Top Users by Likes");
        System.out.println("5. Exit");
    }

    private static int getUserChoice(Scanner scanner) {
        System.out.print("Select an option: ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // Read and discard the invalid input
            System.out.println("Invalid choice. Please enter a valid integer.");
            System.out.print("Select an option: ");
        }
        return scanner.nextInt();
    }

    private static int getTopNValue(Scanner scanner) {
        System.out.print("Enter the number of top users: ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // Read and discard the invalid input
            System.out.println("Invalid input. Please enter a valid integer.");
            System.out.print("Enter the number of top users: ");
        }
        return scanner.nextInt();
    }

    private static void displayTopUsersByLikes(Map<String, Integer> topUsers) {
        System.out.println("Top Users by Likes:");
        topUsers.forEach((username, likes) ->
                System.out.println(username + ": " + likes + " likes"));
    }
}