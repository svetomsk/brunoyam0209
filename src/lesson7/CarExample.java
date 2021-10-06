package lesson7;

public class CarExample {
    public static void main(String[] args) {
        Car bmw = new Car("X5", "a777a");
        System.out.println(bmw);
//        bmw.model = "X5";
//        bmw.number = "a777aa";
//        bmw.velocity = 0;
        System.out.println(bmw.getModel() + " " + bmw.getNumber());
        bmw.speedUp(60);
        System.out.println("Speed: " + bmw.getVelocity());
        bmw.slowDown(20);
        System.out.println("Speed: " + bmw.getVelocity());
        bmw.setVelocity(399);
        System.out.println(bmw.getVelocity());

        Parking garage = new Parking();
        garage.parkCar(bmw);

        System.out.println(garage);
    }
}
