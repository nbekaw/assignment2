// Employee class extends the Person class, inheriting its properties and methods.
public class Employee extends Person  {
    private String position;
    private double salary;
    // Default constructor calling the superclass (Person) default constructor.
    public Employee(){
        super();
    }
    // Parameterized constructor to initialize Employee with name, surname, position, and salary.
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
    // Overridden toString() method to provide a custom string representation of the Employee object.
    @Override
    public String toString() {
        return super.toString() +
                "\nsalary = " + salary + " tg\n";
    }
}
