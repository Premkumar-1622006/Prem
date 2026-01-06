class Book {
    int bookId;
    String title;

    Book(int id, String t) {
        bookId = id;
        title = t;
    }

    void display() {
        System.out.println(bookId + " " + title);
    }

    public static void main(String[] args) {
        Book[] b = new Book[3];

        b[0] = new Book(1, "Java");
        b[1] = new Book(2, "Python");
        b[2] = new Book(3, "C++");

        for (int i = 0; i < b.length; i++) {
            b[i].display();
        }
    }
}
