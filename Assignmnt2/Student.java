public class Student extends Person{
    private  double gpa;

    public Student(){
        super();
    }
    public Student(String name,String surname,double gpa){
        super(name,surname);
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

    @Override
    public double getPaymentAmount(){
        if(this.gpa>2.67){
            return 36660.00;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "\ngpa = " + gpa+
                "\nsalary = " + getPaymentAmount()+" tg\n";

    }
}