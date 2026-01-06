class Student {
    int rollNo;
    String name;

    void setData(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setData(101, "Hariprasath");
        s.display();
    }
}
