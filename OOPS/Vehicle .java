class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike riding");
    }
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
