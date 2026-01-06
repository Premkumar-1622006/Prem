interface Sports {
    void play();
}
interface Music {
    void sing();
}
class Student implements Sports, Music {
    public void play() {
        System.out.println("Playing cricket");
    }
    public void sing() {
        System.out.println("Singing song");
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.play();
        s.sing();
    }
}

