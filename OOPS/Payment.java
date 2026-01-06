interface Payment {
    void pay();
}
class User {
    void login() {
        System.out.println("Login successful");
    }
}
class Customer extends User implements Payment {
    public void pay() {
        System.out.println("Payment done");
    }
    public static void main(String[] args) {
        Customer c = new Customer();
        c.login();
        c.pay();
    }
}
