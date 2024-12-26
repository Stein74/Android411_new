package src.Lesson24;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivanov Ivan");
        student1.countScholarship(5);
        Student student2 = new Student("Petrov Petr");
        student2.countScholarship(3);
        Aspirant aspirant1 = new Aspirant("Sidorov John");
        aspirant1.countScholarship(5);
        Aspirant aspirant2 = new Aspirant("Bagenov Evgen");
        aspirant2.countScholarship(4);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(aspirant1);
        System.out.println(aspirant2);
    }
}
