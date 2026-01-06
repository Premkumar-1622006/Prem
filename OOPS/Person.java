class Person {
    int age;

    Person(int age) {
        this.age = age; 
    }

    void showAge() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person(20);
        p.showAge();
    }
}