class GrandFather {
    void house() {
        System.out.println("Grandfather house");
    }
}
class Father extends GrandFather {
    void car() {
        System.out.println("Father car");
    }
}
class Son extends Father {
    public static void main(String[] args) {
        Son s = new Son();
        s.house();
        s.car();
    }
}
