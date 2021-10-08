package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        drawCat();
    }

    public static void printThreeWords(){
        System.out.println("ЗАДАНИЕ №1");
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
        }

    public static void checkSumSign() {
        System.out.println("ЗАДАНИЕ №2");
        int a = 100, b = -200, summ = a + b;
        System.out.print("a=" + a + ", b=" + b);
        if (summ >= 0) {
            System.out.println(", сумма переменных a и b положительная, и равна " + summ);
        } else {
            System.out.println(", сумма переменных a и b отрицательная, и равна " + summ);
        }
    }

    public static void printColor() {
        System.out.println("ЗАДАНИЕ №3");
        int value=140;
        System.out.print("value=" + value + ", поэтому код ");
        if (value<=0) {
            System.out.println("Красный");
        } else if (value>0 && value<100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        System.out.println("ЗАДАНИЕ №4");
        int a = 100, b = 200;
        System.out.print("a=" + a + ", b=" + b);
        if (a>=b){
            System.out.println(", т.е. a >= b");
        } else {
            System.out.println(", т.е. a < b");
        }
    }

    public static void drawCat() {
        System.out.println("BONUS");
        System.out.println("Просто интересно, а вы любите котиков? )))))))");
        System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
                "        .''        ,      ``..'(/-<\n" +
                "       /   _      {      )         \\\n" +
                "      ;   _ `.     `.   <         a(\n" +
                "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
                "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
                "    `. `-' /-._)))      `-._)))\n" +
                "      `...'         ");
    }

}
