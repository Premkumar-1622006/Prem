class Device {
    void powerOn() {
        System.out.println("Power ON");
    }
}
class Mobile extends Device {
    void call() {
        System.out.println("Calling");
    }
}
class SmartPhone extends Mobile {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.powerOn();
        sp.call();
    }
}
