package HW;

import java.util.Scanner;

public class HW_17_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = sc.nextInt();

        System.out.println(a);
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));
    }
}
