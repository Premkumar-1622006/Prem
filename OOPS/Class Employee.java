class Employee {
    int id;
    String name;

    void set(int i, String n) {
        id = i;
        name = n;
    }

    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.set(1, "Amit");
        e2.set(2, "Ravi");

        e1.show();
        e2.show();
    }
}
