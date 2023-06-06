package HW;

import java.util.Scanner;

public class CofeeSwitch {
    public static void main(String[] args) {

        getSomeDrink();

    }

    public static void getSomeDrink() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Выберите напиток: 1 - эспрессо, 2 - американо, 3 - капучино, 4 - чай : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                getEspresso();
                goodbye();
                break;

            case 2:
                getAmericano();
                goodbye();
                break;

            case 3:
                getCappuccino();
                goodbye();
                break;

            case 4:
                getTea();
                goodbye();
                break;
            default:
                System.out.println("Алкогольные напитки пока не завезли. Выберите чай или кофе");
                getSomeDrink();
        }
    }

    public static void getEspresso() {
        System.out.println("Готовится эспрессо");
        System.out.println("Не эКспрессо, а эспрессо!");
    }

    public static void getAmericano() {
        getEspresso();
        System.out.println("Добавляем боооольше воды");
    }

    public static void getCappuccino() {
        getEspresso();
        getMilk();
        System.out.println("Теперь смешать");
    }

    public static void getMilk() {
        System.out.println("Вспениваем наше супермолоко");
    }

    public static void getTea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите чаёк. Черный - 1, Зеленый - 2, С лимоном - 3 : ");
        int tea = sc.nextInt();

        switch (tea) {
            case 1:
                System.out.println("Достаем пакет черного чаю");
                System.out.println("Завариваем кипяточком");
                System.out.println("Добавьте сахар по вкусу");
                break;
            case 2:
                System.out.println("Достаем пакет зеленого чаю");
                System.out.println("Завариваем кипяточком");
                System.out.println("Добавьте сахар по вкусу");
                break;
            case 3:
                System.out.println("Достаем пакет черного чаю");
                System.out.println("Немного лимона...");
                System.out.println("Завариваем кипяточком");
                System.out.println("Добавьте сахар по вкусу");
                break;
            default:
                System.out.println("Такого чаю пока нет. Здесь вам не ресторан :)");
                getTea();
        }
    }

    public static void goodbye() {
        System.out.println("Bingo!");
        System.out.println();
        System.out.println("Приходите еще.");
    }
}

