package src.Lesson20;

public class Main {
    public static void main(String[] args) {
        Vihicle vihicle = new Vihicle("X7 M50i", "BMW", "red", 2021, 530, 10790000);

        System.out.println("*************Данные автомобиля*************");
        System.out.printf("Название модели: %s%nГод выпуска: %d%nПроизводитель: %s%n" +
                "Мощность двигателя: %d л.с.%nЦвет машиныЖ %s%nЦена: %d%n",
                vihicle.getModel(), vihicle.getYear(), vihicle.getProducer(), vihicle.getPower(),
                vihicle.getColor(), vihicle.getPrice());
        System.out.println("===========================================");
    }
}
