import java.util.*;
class HR extends User {
    HR(String username, String password) {
        super(username, password);
    }

    @Override
    public void menu(EmployeeManager manager) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- HR Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> manager.addEmployee();
                case 2 -> manager.viewEmployees();
                case 3 -> manager.searchEmployee();
                case 4 -> manager.updateEmployee();
                case 5 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
