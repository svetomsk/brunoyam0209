package lesson7;

public class Car {
    private String model;
    private String number;
    private double velocity;

    public Car() { }

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Car(String model, String number, double velocity) {
        this.model = model;
        this.number = number;
        this.velocity = velocity;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        if (velocity > 200) {
            velocity = 200;
        }
        this.velocity = velocity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void speedUp(double value) {
        velocity += value;
    }

    public void slowDown(double value) {
        velocity -= value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
