import java.util.Scanner;

class StreamingSubscription {
    int subscriberId;
    String subscriberName;
    String previousStatus;
    String currentStatus;
    String subscriptionType;
    double monthlyCharge;

    StreamingSubscription(int id, String name, String previous,
                          String current, String type) {
        subscriberId = id;
        subscriberName = name;
        previousStatus = previous;
        currentStatus = current;
        subscriptionType = type;
    }

    void calculateBill() {
        if (subscriptionType.equalsIgnoreCase("Basic")) {
            monthlyCharge = 199;
        }
        else if (subscriptionType.equalsIgnoreCase("Standard")) {
            monthlyCharge = 499;
        }
        else if (subscriptionType.equalsIgnoreCase("Premium")) {
            monthlyCharge = 799;
        }
        else {
            monthlyCharge = 0;
        }
    }

    void displayBill() {
        System.out.println("\n==============================================");
        System.out.println("       MONTHLY STREAMING SUBSCRIPTION BILL");
        System.out.println("==============================================");
        System.out.println("Subscriber ID         : " + subscriberId);
        System.out.println("Subscriber Name       : " + subscriberName);
        System.out.println("Previous Month Status : " + previousStatus);
        System.out.println("Current Month Status  : " + currentStatus);
        System.out.println("Subscription Type     : " + subscriptionType);
        System.out.println("Monthly Charge        : Rs." + monthlyCharge);
        System.out.println("----------------------------------------------");

        if (currentStatus.equalsIgnoreCase("Active")) {
            System.out.println("Total Bill            : Rs." + monthlyCharge);
        }
        else {
            System.out.println("Total Bill            : Rs.0");
        }

        System.out.println("==============================================");
    }
}

public class StreamingBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("     STREAMING SUBSCRIPTION BILL SYSTEM");
        System.out.println("==============================================");

        System.out.print("Enter Subscriber ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Subscriber Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Previous Month Status: ");
        String previous = sc.nextLine();

        System.out.print("Enter Current Month Status: ");
        String current = sc.nextLine();

        System.out.println("\nSubscription Types:");
        System.out.println("1. Basic    - Rs.199");
        System.out.println("2. Standard - Rs.499");
        System.out.println("3. Premium  - Rs.799");

        System.out.print("Enter Subscription Type: ");
        String type = sc.nextLine();

        StreamingSubscription subscriber =
            new StreamingSubscription(id, name, previous, current, type);

        subscriber.calculateBill();
        subscriber.displayBill();

        sc.close();
    }
}