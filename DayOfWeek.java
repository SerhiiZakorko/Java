package HW;

import java.util.Arrays;

public class DayOfWeek {
    public static void main(String[] args) {
        String[] week = new String[7];

        int[] daysOfWeek = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < daysOfWeek.length; i++) {

            int dayOfWeek = daysOfWeek[i];

            switch (dayOfWeek) {
                case 1:
                    week[0] = "Понедельник";
                    break;
                case 2:
                    week[1] = "Вторник";
                    break;
                case 3:
                    week[2] = "Среда";
                    break;
                case 4:
                    week[3] = "Четверг";
                    break;
                case 5:
                    week[4] = "Пятница";
                    break;
                case 6:
                    week[5] = "Суббота";
                    break;
                case 7:
                    week[6] = "Воскресенье";
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        }
        System.out.println(Arrays.toString(week));
        System.out.println();
        System.out.println(week[6]);
    }
}
