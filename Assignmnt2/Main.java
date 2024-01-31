import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> Humans = new ArrayList<>(); // Create an ArrayList to store objects of type Person.
        // Create instances of Employee and Student, and add them to the ArrayList.
        Employee Adam = new Employee("Adam","White","Investor",180000.00);
        Humans.add(Adam);

        Employee Nursultan = new Employee("Nursultan","Java","Teacher",1500000.00);
        Humans.add(Nursultan);

        Student Bekzat = new Student("Bekzat","Nabiev",2.79);
        Humans.add(Bekzat);

        Student Ermek = new Student("Ermek","Surf",3.3);
        Humans.add(Ermek);

        Student Beka_OOP = new Student("Beka","OOPJava",1.0);
        Humans.add(Beka_OOP);

        Collections.sort(Humans, Comparator.comparingDouble(Person::getPaymentAmount));

        for(Person person : Humans){
            System.out.println(person);
        }

    }
}
