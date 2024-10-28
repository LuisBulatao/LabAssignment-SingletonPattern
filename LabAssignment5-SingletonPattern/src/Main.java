import java.util.*;
import QueueNumber.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue queueNumber = Queue.getInstance();

        boolean stooper = false;
        do {
            System.out.println("\nQueue System Options:");
            System.out.println("1. Get Next Queue Number");
            System.out.println("2. View Current Queue Number");
            System.out.println("3. Reset Queue Number");
            System.out.println("4. Exit");

            System.out.print("Please Choose a Number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int nextQueueNumber = queueNumber.nextNumber();
                    System.out.println("Next Queue Number: " + nextQueueNumber);
                    break;

                case 2:
                    int currentQueueNumber = queueNumber.getNumber();
                    System.out.println("Current Queue Number: " + currentQueueNumber);
                    break;

                case 3:
                    System.out.print("Enter the new queue number to reset: ");
                    int resetValue = scanner.nextInt();
                    queueNumber.resetNumber(resetValue);
                    System.out.println("Queue number reset to " + resetValue);
                    break;

                case 4:
                    stooper = true;
                    System.out.println("Exiting Centralized Queuing System.");
                    break;

                default:
                    System.out.println("Please choose between 1-4.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String continueLoop = scanner.next();
            stooper = continueLoop.equalsIgnoreCase("no");

        } while (!stooper);

        scanner.close();
    }
}