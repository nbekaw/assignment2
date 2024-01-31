import java.util.Comparator;

public class Student extends Person {
    private double gpa;

    // calls superclass person
    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    // checks gpa and returns scholarship. Low gpa = no money
    @Override
    public double getPaymentAmount() {
        return (this.gpa > 2.67) ? 36660.00 : 0;
    }

    // Overridden toString() method to provide a custom string representation of the Student object.
    @Override
    public String toString() {
        return super.toString() +
                "\ngpa = " + gpa +
                "\nsalary = " + getPaymentAmount() + " tg\n";
    }
}
