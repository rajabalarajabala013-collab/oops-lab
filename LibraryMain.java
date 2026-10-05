import java.util.Scanner;

abstract class LibraryMember {
    String memberId, name, email, phone;

    LibraryMember(String id, String name, String email, String phone) {
        this.memberId = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    abstract void generateSummary();
}

class StudentMember extends LibraryMember {
    StudentMember(String id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    void generateSummary() {
        System.out.println("\nMember Type            : Student");
        System.out.println("Borrowing Limit        : 5 Books");
        System.out.println("Penalty Per Day        : Rs.2");
        System.out.println("Annual Membership Fee  : Rs.500");
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    void generateSummary() {
        System.out.println("\nMember Type            : Faculty");
        System.out.println("Borrowing Limit        : 10 Books");
        System.out.println("Penalty Per Day        : Rs.1");
        System.out.println("Annual Membership Fee  : Rs.1000");
    }
}

class ExternalMember extends LibraryMember {
    ExternalMember(String id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    void generateSummary() {
        System.out.println("\nMember Type            : External");
        System.out.println("Borrowing Limit        : 3 Books");
        System.out.println("Penalty Per Day        : Rs.5");
        System.out.println("Annual Membership Fee  : Rs.1500");
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Member ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.println("\n1. Student Member");
        System.out.println("2. Faculty Member");
        System.out.println("3. External Member");
        System.out.print("Enter Member Type: ");
        int choice = sc.nextInt();

        LibraryMember member;

        switch (choice) {
            case 1:
                member = new StudentMember(id, name, email, phone);
                break;
            case 2:
                member = new FacultyMember(id, name, email, phone);
                break;
            case 3:
                member = new ExternalMember(id, name, email, phone);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println("\n----- MEMBER DETAILS -----");
        System.out.println("Member ID : " + member.memberId);
        System.out.println("Name      : " + member.name);
        System.out.println("Email     : " + member.email);
        System.out.println("Phone     : " + member.phone);

        member.generateSummary();

        sc.close();
    }
}