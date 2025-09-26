class PermanentEmployee extends Employee {
    private  double monthlySalary;
    private double bonus;
    public PermanentEmployee( String firstName, String lastName,int id, String designation, String department,
                              double basicSalary, double bonus) {
        super( firstName, lastName,id, designation, department);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }


    @Override
    public double calculatesalary() {
        return getMonthlySalary()+getBonus();
    }
}
