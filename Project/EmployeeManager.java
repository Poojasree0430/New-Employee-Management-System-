import java.util.*;
class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public List<Employee> getEmployees() {
        return employees;
    }

    // ---------- Create ----------
    public void addEmployee() {
        System.out.println("\nSelect Employee Type:");
        System.out.println("1. Permanent Employee");
        System.out.println("2. Contract Employee");
        System.out.println("3. Intern");
        int type = sc.nextInt();
        sc.nextLine();


        System.out.print("Enter First Name: "); String firstName = sc.nextLine();
        System.out.print("Enter Last Name: "); String lastName = sc.nextLine();
        System.out.print("Enter ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Designation: "); String designation = sc.nextLine();
        System.out.print("Enter Department: "); String department = sc.nextLine();

        switch(type) {
            case 1 -> {
                System.out.print("Enter Basic Salary: "); double basic = sc.nextDouble();
                System.out.print("Enter Bonus: "); double bonus = sc.nextDouble();
                employees.add(new PermanentEmployee( firstName, lastName,id, designation, department, basic, bonus));
            }
            case 2 -> {
                System.out.print("Enter Hours Worked: "); int hours = sc.nextInt();
                System.out.print("Enter Hourly Rate: "); double rate = sc.nextDouble();
                employees.add(new ContractEmployee( firstName, lastName, id,designation, department, hours, rate));
            }
            case 3 -> {
                System.out.print("Enter Stipend: "); double stipend = sc.nextDouble();
                employees.add(new Intern(firstName, lastName,id, designation, department, stipend));
            }
            default -> System.out.println("Invalid Employee Type!");
        }
        System.out.println("Employee added successfully!");
        System.out.println("------------------------------");

    }

    // ---------- Read ----------
    public void viewEmployees() {
        System.out.println("\n===== Employee List =====");
        if (employees.isEmpty()) {
            System.out.println("No employees found!");
        } else {
            for (Employee e : employees) {
                System.out.println(e);
                System.out.println("------------------------------");
            }
        }
    }


    public void searchEmployee() {
        System.out.print("Enter Employee ID to search: "); int id = sc.nextInt();
        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println("Found: " + e);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // ---------- Update ----------
    public void updateEmployee() {
        System.out.print("Enter Employee ID to update: "); int id = sc.nextInt(); sc.nextLine();
        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.print("Enter new First Name: "); e.setFirstName(sc.nextLine());
                System.out.print("Enter new Last Name: "); e.setLastName(sc.nextLine());
                System.out.print("Enter new Designation: "); e.setDesignation(sc.nextLine());
                System.out.print("Enter new Department: "); e.setDept(sc.nextLine());

                if (e instanceof PermanentEmployee pe) {
                    System.out.print("Enter new Monthly Salary: "); pe.setMonthlySalary(sc.nextDouble());
                    System.out.print("Enter new Bonus: "); pe.setBonus(sc.nextDouble());
                } else if (e instanceof ContractEmployee ce) {
                    System.out.print("Enter new Hours Worked: "); ce.setHourlyWorked(sc.nextInt());
                    System.out.print("Enter new Hourly Rate: "); ce.setHourlyRate(sc.nextDouble());
                } else if (e instanceof Intern ie) {
                    System.out.print("Enter new Stipend: "); ie.setStipend(sc.nextDouble());
                }
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // ---------- Delete ----------
    public void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: "); int id = sc.nextInt();
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }
}
