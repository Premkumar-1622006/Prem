class Account {
    void type() {
        System.out.println("Account");
    }
}
class Savings extends Account {}
class Current extends Account {}
class Test5 {
    public static void main(String[] args) {
        new Savings().type();
        new Current().type();
    }
}
