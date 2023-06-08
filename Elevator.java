package HW;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        System.out.println("Лифт, находящийся на первом этаже здания высотой H, \n должен подняться на последний этаж. Лифт сломан. \n Каждый раз он поднимается на N этажей и спускается на M этажей. \n Если на последнем подъёме лифт превысил количество этажей, \n то считается что лифт поднялся на самый верх. \n Найдите количество подъёмов, которые понадобятся лифту.");
        System.out.print("Введите высоту здания (этажей): ");
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        System.out.print("Введите переменную N: ");
        int N = sc.nextInt();
        System.out.print("Введите переменную M; ");
        int M = sc.nextInt();
        sc.close();

        int floor = 0;
        int cycle = (N - M);

        if (M > N) {
            System.out.println("На таком лифте вы никуда не доедете");
        } else {
            int i = 0;
            do {
                floor = floor + cycle;
                i++;
            } while (H > floor);

            System.out.println("Вам понадобиться запустить лифт " + i + " раз.");
        }
    }
}



