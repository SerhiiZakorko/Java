package HW;

import java.util.Scanner;

public class Box {
    float width;
    float high;
    float dept;
    public Box (float width, float high, float dept){
        this.width = width;
        this.high = high;
        this.dept = dept;

        System.out.println("Объем коробки равен " + width*high*dept);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину, высоту и глубину коробки: ");
        new Box(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        sc.close();
    }
}

