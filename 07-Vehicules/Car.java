public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public String doStuff() {
        return "Je suis " + super.getBrand() + " et je fais vroum vroum !";
    }
}
