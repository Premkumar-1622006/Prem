class Shape {
    void draw() {
        System.out.println("Drawing");
    }
}
class Circle extends Shape {}
class Square extends Shape {}
class Test2 {
    public static void main(String[] args) {
        new Circle().draw();
        new Square().draw();
    }
}
