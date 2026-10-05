import java.util.Scanner;

class Employee {
    String emp_name;
    String emp_id;
    String address;
    String mail_id;
    String mobile_no;
    double basicPay;

    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        emp_name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Mail ID: ");
        mail_id = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        mobile_no = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();
    }

    void calculateSalary() {
        double da = 0.90 * basicPay;
        double hra = 0.12 * basicPay;
        double pf = 0.14 * basicPay;
        double staffClub = 0.002 * basicPay;

        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClub;

        System.out.println("\n========== PAY SLIP ==========");
        System.out.println("Employee Name : " + emp_name);
        System.out.println("Employee ID   : " + emp_id);
        System.out.println("Address       : " + address);
        System.out.println("Mail ID       : " + mail_id);
        System.out.println("Mobile No     : " + mobile_no);
        System.out.println("------------------------------");
        System.out.printf("Basic Pay     : %.2f%n", basicPay);
        System.out.printf("DA (90%%)      : %.2f%n", da);
        System.out.printf("HRA (12%%)     : %.2f%n", hra);
        System.out.printf("PF (14%%)      : %.2f%n", pf);
        System.out.printf("Staff Fund    : %.2f%n", staffClub);
        System.out.printf("Gross Salary  : %.2f%n", grossSalary);
        System.out.printf("Net Salary    : %.2f%n", netSalary);
        System.out.println("==============================");
    }
}

class Professor extends Employee {
    void display() {
        System.out.println("\nEmployee Designation: Professor");
        calculateSalary();
    }
}

class AssociateProfessor extends Employee {
    void display() {
        System.out.println("\nEmployee Designation: Associate Professor");
        calculateSalary();
    }
}

public class EmployeePaySlip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EMPLOYEE PAY SLIP =====");

        System.out.println("\nEnter Professor Details");
        Professor professor = new Professor();
        professor.getEmployeeDetails(sc);
        professor.display();

        sc.nextLine();

        System.out.println("\nEnter Associate Professor Details");
        AssociateProfessor associate = new AssociateProfessor();
        associate.getEmployeeDetails(sc);
        associate.display();

        sc.close();
    }
}