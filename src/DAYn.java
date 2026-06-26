public class DAYn {
    public static void main(String[] args) {
        Car c1= new EV();
        Car c2= new FC();
      c1.accelerate();
      c1.Brake();
      c1.start();

      c2.Brake();
      c2.start();
      c2.accelerate();
    }
}
 abstract class Car{

    void start(){
        System.out.println("Starting Car");
    }
    abstract void accelerate();
    abstract void Brake();
}

class EV extends Car{

    @Override
    void accelerate(){
        System.out.println("Accelerating EV");
    }

    @Override
    void Brake(){
        System.out.println("Braking EV");
    }
}

class FC extends Car{
    @Override
    void accelerate(){
        System.out.println("Accelerating FC");
    }

    @Override
    void Brake(){
        System.out.println("Braking FC");
    }
}
