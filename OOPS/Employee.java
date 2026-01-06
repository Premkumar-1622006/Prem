class Employee {
    void salary() {
        System.out.println("Base salary");
    }
}
class Manager extends Employee {}
class Developer extends Employee {}
class Test3 {
    public static void main(String[] args) {
        new Manager().salary();
        new Developer().salary();
    }
}
