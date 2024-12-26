package src.Lesson24;

public class Aspirant extends Student{

    @Override
    public void countScholarship(int avgGrad){
        setScholarship(avgGrad == 5 ? 2000: 1800);
    }

    @Override
    public void setScholarship(int scholarship) {
        super.setScholarship(scholarship);
    }

    public Aspirant(String name) {
        super(name);
    }
}
