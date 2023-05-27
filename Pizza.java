package HW;

public class Pizza {
    public static void main(String[] args) {
        int radiusSmall;
        int radiusBig;
        getCalory(24, 28);
    }

    public static void getCalory(int radiusSmall, int radiusBig) {
        int cal = 40;
        double squareSmall = Math.PI * (Math.pow(radiusSmall, 2));
        double squareBig = Math.PI * (Math.pow(radiusBig, 2));
        double calorySmall = squareSmall * cal;
        double caloryBig = squareBig * cal;
        int difference = (int) (caloryBig - calorySmall);
        System.out.println("Вы переели на " + difference + " калорий");
    }
}
