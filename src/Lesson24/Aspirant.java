package src.Lesson24;

public class Aspirant extends Student{

    @Override
    public void countScholarship(int avgGrad){
        super.setScholarship(avgGrad == 5 ? 2000: 1800);
    }

    public Aspirant(String name) {
        super(name);
    }
}
