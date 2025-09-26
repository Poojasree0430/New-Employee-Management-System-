class ContractEmployee extends Employee{
    private  int hourlyWorked;
    private  double hourlyRate;

    ContractEmployee(String firstName,String lastName,int id,String designation,String dept, int hourlyWorked,double hourlyRate ){
        super(firstName,lastName,id,designation,dept);
        this.hourlyWorked=hourlyWorked;
        this.hourlyRate=hourlyRate;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public int getHourlyWorked() {
        return hourlyWorked;
    }

    public void setHourlyWorked(int hourlyWorked) {
        this.hourlyWorked=hourlyWorked;
    }

    @Override
    public double calculatesalary() {
        return getHourlyRate()*getHourlyWorked();
    }
}
