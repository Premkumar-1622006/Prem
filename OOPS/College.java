class College {
    void collegeName() {
        System.out.println("XYZ College");
    }
}
class Department extends College {
    void deptName() {
        System.out.println("ECE");
    }
}
class Student extends Department {
    public static void main(String[] args) {
        Student s = new Student();
        s.collegeName();
        s.deptName();
    }
}
