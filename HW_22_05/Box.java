package HW;

import java.util.Scanner;

public class Box {

        float width;
        float high;
        float depth;

        public Box(float width, float high, float depth){
            this. width = width;
            this.high = high;
            this.depth = depth;

            System.out.println("Объем коробки равен: " + width*high*depth);
        }

}
