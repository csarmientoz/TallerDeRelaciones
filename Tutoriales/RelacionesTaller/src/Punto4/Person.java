package punto4;


public class Person {
private Date date;

    public Person(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" + "date=" + date + '}';
    }

}