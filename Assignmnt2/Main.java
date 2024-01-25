import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> Peoplee = new ArrayList<>();
        Employee Adam = new Employee("Adam","White","Investor",180000.00);
        Employee Nursultan = new Employee("Nursultan","Java","Teacher",1500000.00);
        Student Bekzat = new Student("Bekzat","Nabiev",2.79);
        Student Ermek = new Student("Ermek","Surf",3.3);
        Peoplee.add(Adam);
        Peoplee.add(Nursultan);
        Peoplee.add(Bekzat);
        Peoplee.add(Ermek);
        Collections.sort(Peoplee, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Double.valueOf(person1.getPaymentAmount()).compareTo(person2.getPaymentAmount());
            }
        });
        for(Person person : Peoplee){
            System.out.println(person);
        }

    }
}
