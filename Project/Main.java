import java.util.*;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Login Menu =====");
            System.out.println("1. Login as HR");
            System.out.println("2. Login as Manager");
            System.out.println("3. Login as Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            User user = null;
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter HR Username: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter HR Password: ");
                    String pwd = sc.nextLine();


                    if (uname.equals("hr") && pwd.equals("123")) {
                        user = new HR(uname, pwd);
                    } else {
                        System.out.println("Invalid HR credentials!");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Manager Username: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter Manager Password: ");
                    String pwd = sc.nextLine();


                    if (uname.equals("manager") && pwd.equals("123")) {
                        user = new Manager(uname, pwd);
                    } else {
                        System.out.println("Invalid Manager credentials!");
                    }
                }
                case 3 -> {
                    System.out.print("Enter Employee Username: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter Employee Password: ");
                    String pwd = sc.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();

                    if (uname.equals("emp") && pwd.equals("123")) {
                        user = new EmployeeUser(uname, pwd, empId);
                    } else {
                        System.out.println("Invalid Employee credentials!");
                    }
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }

            if (user != null) {
                user.menu(manager);
            }
        }
    }
}
