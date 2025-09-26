abstract class User {
    private String username;
    private String password; // simple for now (can be extended)

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public abstract void menu(EmployeeManager manager);
}
