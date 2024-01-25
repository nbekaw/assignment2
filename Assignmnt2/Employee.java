public class Employee extends Person  {
    private String position;
    private double salary;
    public Employee(){
        super();
    }
    public Employee(String name,String surname,String position,double salary){
        super(name,surname);
        this.position = position;
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public double getPaymentAmount(){
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nsalary = " + salary + " tg\n";
    }
}