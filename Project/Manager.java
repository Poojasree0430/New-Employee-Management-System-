import java.util.*;
class Manager extends User {
    Manager(String username, String password) {
        super(username, password);
    }

    @Override
    public void menu(EmployeeManager manager) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Manager Menu ---");
            System.out.println("1. View Employees");
            System.out.println("2. View HR Details");
            System.out.println("3. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> manager.viewEmployees();
                case 2 -> System.out.println("HR: Access to employees' data and updates");
                case 3 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
