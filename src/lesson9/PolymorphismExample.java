package lesson9;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
        System.out.println(animal.hashCode());
    }
}

class Animal {
    @Override
    public String toString() {
        return "Animal";
    }

    @Override
    public int hashCode() {
        return 42;
    }
}