class Person {
    String name = "Hari";
}
class Student extends Person {
    int roll = 101;
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.roll);
    }
}
