public class TicketMachine {
    private int balance;
    private int price;
    private int total;

    public TicketMachine(int ticketCost) {
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    public int getPrice() {
        return price;
    }

    public int getBalance() {
        return balance;
    }

    // Method to insert money with user input
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Inserted: " + amount + " cents.");
        } else {
            System.out.println("Please insert a positive amount.");
        }
    }

    // Method to print ticket based on current balance
    public void printTicket() {
        if (balance >= price) {
            System.out.println("####################");
            System.out.println("Ticket");
            System.out.println(price + " cents.");
            System.out.println("####################");

            total += price;
            balance -= price; // Subtract price from balance
        } else {
            System.out.println("You need at least " + (price - balance) + " more cents to print the ticket.");
        }
    }

    // Optionally, a method to check total earnings
    public int getTotal() {
        return total;
    }
}
