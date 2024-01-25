public abstract class Person implements Payable,Comparable<Person> {
    private int id;
    private static int CounterId = 0;
    private String name;
    private String surname;
    public Person(){
    }
    public Person(String name,String surname) {
        CounterId++;
        id = CounterId;
        setName(name);
        setSurname(surname);
    }

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

    public String getSurname() {
        return surname;
    }

    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

    public abstract String getPosition();
    @Override
    public String toString() {
        return  getPosition() + " " +
                "id = " + GetID() + ", name = " + name + ", surname = " + surname;
    }
}
