package HW;

import java.util.Scanner;

public class ForX2 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел геометрической прогрессии: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        long a = 1;
        System.out.println(a);
        for (int i = 0; i < (x - 1); i++) {
            a = a * 2;
            System.out.println(a);
        }
    }
}
