interface Father {
    void fatherProperty();
}
interface Mother {
    void motherProperty();
}
class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("House");
    }
    public void motherProperty() {
        System.out.println("Gold");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.fatherProperty();
        c.motherProperty();
    }
}
