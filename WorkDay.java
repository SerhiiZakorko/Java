import java.util.Random;

public class WorkDay {
    public static void main(String[] args) {
        getTime();
    }

    public static void getTime() {
        Random r = new Random();
        int timeSec = r.nextInt(0, 28801);
        int timeHour = timeSec / 3600;
        System.out.println("Осталось " + timeSec + " секунд");
        if (timeHour < 1) {
            System.out.println("Осталось менее часа");
        } else System.out.println("Осталось " + timeHour + " полных часов");
    }
}
