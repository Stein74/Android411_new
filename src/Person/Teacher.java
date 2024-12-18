package src.Person;

public class Teacher extends Human{
    private String subject;
    private int hours;

    public Teacher(String lastName, String firstName, int age, String subject, int hours) {
        super(lastName, firstName, age);
        setSubject(subject);
        setHours(hours);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "subject='" + subject + '\'' +
                ", hours=" + hours +
                '}';
    }
}
