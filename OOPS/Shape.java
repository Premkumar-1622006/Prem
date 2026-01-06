class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}

