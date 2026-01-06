class Rectangle {
    int length;
    int breadth;

    void setValues(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setValues(10, 5);
        r.area();
    }
}
