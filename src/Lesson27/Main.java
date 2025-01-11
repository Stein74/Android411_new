package src.Lesson27;

public class Main {
    public static void main(String[] args) {

        Transport[] trArray = Transport.values();

        System.out.println("Скорости транспортных средств:");
        for (Transport tr : trArray){
            System.out.printf("%s типичная скорость составляет %d миль в час.%n",
                    tr.name(), tr.speed);
        }

    }

   enum Transport{
        CAR(65),
        TRUCK(55),
        AIRPLAIN(600),
        TRAIN(70),
        BOAT(22);

        public int speed;

       Transport(int speed) {
           this.speed = speed;
       }
   }
}
