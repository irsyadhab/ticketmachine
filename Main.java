import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the ticket price
        System.out.println("Enter the ticket price in cents: ");
        int ticketPrice = scanner.nextInt();

        // Create a TicketMachine with the user-specified ticket price
        TicketMachine machine = new TicketMachine(ticketPrice);

        // Display the ticket price
        System.out.println("Ticket price is: " + machine.getPrice() + " cents.");

        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an action:");
            System.out.println("1. Insert Money");
            System.out.println("2. Print Ticket");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount of money you want to insert: ");
                    int amount = scanner.nextInt();
                    machine.insertMoney(amount); // Prompt for money insertion
                    break;
                case 2:
                    machine.printTicket(); // Try printing the ticket
                    break;
                case 3:
                    System.out.println("Current balance: " + machine.getBalance() + " cents.");
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Exiting program...");
    }
}
