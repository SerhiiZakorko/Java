package HW;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите градусы по Цельсию: ");
        int celsius = sc.nextInt();
        sc.close();

        int kelvin = celsius + 273;
        int fahrenheit = (int) (celsius * 9 / 5) + 32;
        System.out.println("Температура в градусах Кельвина составляет " + kelvin + " градусов");
        System.out.println("Температура в градусах Фаренгейта  составляет " + fahrenheit + " градусов");
    }
}

