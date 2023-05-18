package HW;

public class HW_18_05 {
    public static void main(String[] args) {
        char n = '4';
        int result1 = Integer.parseInt(String.valueOf(n));
        System.out.println(result1 + 6);

        int result2 = Character.getNumericValue(n);
        System.out.println(result2 + 6);
    }
}
