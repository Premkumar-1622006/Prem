interface Engine {
    void engineType();
}
interface Wheels {
    void wheelCount();
}
class Car implements Engine, Wheels {
    public void engineType() {
        System.out.println("Petrol Engine");
    }
    public void wheelCount() {
        System.out.println("4 Wheels");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.engineType();
        c.wheelCount();
    }
}
