public abstract class Person implements Payable,Comparable<Person> {
    private int id; //creating all variables
    private static int CounterId = 0;
    private String name;
    private String surname;
    public Person(){
    }
    public Person(String name,String surname) {
        CounterId++;
        id = CounterId; //add +1 to id for every person
        setName(name);
        setSurname(surname);
    }


    // just getters and setters
    public int GetID(){
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

    // Abstract method to be implemented by concrete subclasses
    public abstract String getPosition();

    // Custom string representation of the Person object
    @Override
    public String toString() {
        return getPosition() + " " +
                "id = " + GetID() + ", name = " + name + ", surname = " + surname;
    }
}
