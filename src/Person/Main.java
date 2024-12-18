package src.Person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Батодалаев", "Даши", 16);
        System.out.println(human);
//        System.out.println(human.toString());

        Student student = new Student("Загидуллин", "Линар", 32, "Математика", "MM_220", 90, 95);
        System.out.println(student);

        Teacher teacher = new Teacher("Иванов", "Иван", 35, "Архитектура", 50);
        System.out.println(teacher);
    }
}
