package Lesson1;

public class HW2 {

    // При решении "олимпиадной задачки" в конце второго урока, была допущена неточность: конструкция if (value < 100 || value >1000) позволяет ввести значение 1000. Перед тысячей надо поставить >=

    public static void main(String[] args) {
        System.out.println("***************************************************");
        System.out.println(summ(10,11));
        System.out.println("***************************************************");
        System.out.println(check(-5));
        System.out.println("***************************************************");
        System.out.println(check2(6));
        System.out.println("***************************************************");
        print("Прювет",3);
        System.out.println("***************************************************");
        System.out.println(year(2020));
        System.out.println("***************************************************");
    }

    public static boolean summ(int a,int b){
        return a+b>=10 && a+b<=20;
    }

    public static boolean check(int a){
        return a>=0;
    }

    public static boolean check2(int a){
        return a<0 && a!=0;
    }

    public static void print(String message, int a) {
        if (a<=0){
            System.out.println("Вы ввели не корректное число повторений");
        }
        if (a>100){
            System.out.println("Вы точно хотите забить свою консоль текстом?!");
        }
        while (a > 0){
            System.out.println(message);
            a--;
        }
    }

    public static boolean year(int a){
        if (a%400==0){
            return true;
        } else if (a%100==0){
            return false;
        } else if (a%4==0){
            return true;
        }
        else {
            return false;
        }
    }

}
