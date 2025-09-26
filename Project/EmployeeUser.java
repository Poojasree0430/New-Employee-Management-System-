class EmployeeUser extends User {
    private int empId;

    EmployeeUser(String username, String password, int empId) {
        super(username, password);
        this.empId = empId;
    }

    @Override
    public void menu(EmployeeManager manager) {
        for (Employee e : manager.getEmployees()) {
            if (e.getId() == empId) {
                System.out.println("\n--- My Profile ---");
                System.out.println(e);
                return;
            }
        }
        System.out.println("Employee record not found!");
    }
}
