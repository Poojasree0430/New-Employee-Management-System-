public abstract  class Employee {
    private String firstName;
    private String lastName;
    private  int id;
    private  String designation;
    private String  dept;

    Employee(String firstName,String lastName,int id,String designation,String dept){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id=id;
        this. designation=designation;
        this.dept=dept;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public abstract double calculatesalary();
    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
                "Name: " + getFullName() + "\n" +
                "Role: " + getDesignation() + "\n" +
                "Department: " + getDept() + "\n" +
                "Salary: " + calculatesalary();
    }

}
