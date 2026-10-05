import java.util.Scanner;

class TelephoneBill {
    int customerNumber;
    String customerName;
    int previousMinutes;
    int currentMinutes;
    String connectionType;

    
    TelephoneBill(int customerNumber, String customerName,
                  int previousMinutes, int currentMinutes,
                  String connectionType) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.previousMinutes = previousMinutes;
        this.currentMinutes = currentMinutes;
        this.connectionType = connectionType;
    }

    
    double calculateBill() {
        int minutes = currentMinutes - previousMinutes;
        double bill = 0;

        if (minutes <= 0) {
            return 0;
        }

        if (connectionType.equalsIgnoreCase("prepaid")) {
            if (minutes <= 100) {
                bill = minutes * 1.0;
            } else if (minutes <= 200) {
                bill = (100 * 1.0) + ((minutes - 100) * 1.5);
            } else {
                bill = (100 * 1.0) + (100 * 1.5)
                     + ((minutes - 200) * 2.0);
            }
        } 
        else if (connectionType.equalsIgnoreCase("postpaid")) {
            if (minutes <= 100) {
                bill = minutes * 0.75;
            } else if (minutes <= 200) {
                bill = (100 * 0.75) + ((minutes - 100) * 1.25);
            } else {
                bill = (100 * 0.75) + (100 * 1.25)
                     + ((minutes - 200) * 1.75);
            }
        }

        return bill;
    }

    
    void displayBill() {
        int usedMinutes = currentMinutes - previousMinutes;

        System.out.println("\n========== TELEPHONE BILL ==========");
        System.out.println("Customer Number : " + customerNumber);
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Connection Type : " + connectionType);
        System.out.println("Previous Minutes: " + previousMinutes);
        System.out.println("Current Minutes : " + currentMinutes);
        System.out.println("Used Minutes    : " + usedMinutes);
        System.out.printf("Total Bill      : Rs. %.2f%n", calculateBill());
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Previous Month Call Duration: ");
        int previous = sc.nextInt();

        System.out.print("Enter Current Month Call Duration: ");
        int current = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Connection Type (prepaid/postpaid): ");
        String type = sc.nextLine();

        TelephoneBill bill = new TelephoneBill(
            number, name, previous, current, type
        );

        bill.displayBill();

        sc.close();
    }
}