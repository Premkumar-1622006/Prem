import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Time: " + time.format(formatter));
    }
}
