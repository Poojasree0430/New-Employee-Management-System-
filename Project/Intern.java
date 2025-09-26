class Intern extends Employee {
    private double stipend;

    Intern( String firstName, String lastName, int id,String designation, String department, double stipend) {
        super( firstName, lastName,id, designation, department);
        this.stipend = stipend;
    }

    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }

    @Override
    public double calculatesalary() {
        return stipend;
    }
}
