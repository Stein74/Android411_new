package src.Lesson24;

public class Student {

    private String name;
    private int scholarship;

    public Student(String name){
        this.name = name;
    }

    public void countScholarship(int avgGrad){
        setScholarship(avgGrad == 5 ? 1000 : 800);
    }

    public void setScholarship(int scholarship){
        this.scholarship = scholarship;
    }

    public int getScholarship() {
        return scholarship;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName() + "{" +
                "name='" + name + '\'' +
                ", scholarship=" + scholarship +
                '}';
    }
}
