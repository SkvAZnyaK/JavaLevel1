package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class HW3 {

    public static Scanner grabber = new Scanner(System.in);
    public static Random generator = new Random();

    public static void main(String[] args) {

        arrayFillAndPrint(10);
        System.out.println("***************************************************************");
        array100();
        System.out.println("***************************************************************");
        arrayMultiplication(20);
        System.out.println("***************************************************************");
        diagonals (7);
        System.out.println("***************************************************************");
        registeredArray (7,333);
        System.out.println("***************************************************************");


    }
        // задание 1

        public static void arrayFillAndPrint (int a) {
            System.out.println("Старый масссив");
            int[] oneZero = new int[a];
            for (int i = 0; i < a; i++) {
                oneZero[i] = randomInt(0, 1);
            }
            for (int j = 0; j < a; j++) {
                System.out.print(oneZero[j] + " | ");
            }
            System.out.println();
            System.out.println("Новый массив");
            for (int y=0 ; y<a ; y++) {
                if (oneZero[y]==0) {
                    oneZero[y]=1;
                } else {
                    oneZero[y]=0;
                }
                System.out.print(oneZero[y] + " | ");
            }
            System.out.println();
        }

        public static int randomInt(int val1, int val2) {
            int dif = val2 - val1;
            return val1 + generator.nextInt(dif + 1);
        }

        //задание 2

    public static void array100 (){
        int[] stupidArray = new int[100];
        for (int i = 0 ; i < stupidArray.length ; i++){
            stupidArray[i] = i+1;
        }
        for (int j = 0 ; j < stupidArray.length ; j++){
            System.out.print(stupidArray[j] + ", ");
        }
        System.out.println();
    }

    // задание 3

    public static void arrayMultiplication (int a) {
        System.out.println("Старый масссив");
        int[] array3 = new int[a];
        for (int i = 0; i < a; i++) {
            array3[i] = randomInt(0, 10);
        }
        for (int j = 0; j < a; j++) {
            System.out.print(array3[j] + " | ");
        }
        System.out.println();
        System.out.println("Новый массив");
        for (int y=0 ; y<a ; y++) {
            if (array3[y]<6) {
                array3[y]*=2;
            }
            System.out.print(array3[y] + " | ");
        }
        System.out.println();
    }

    //задание 4

    public static void diagonals (int a){
        int[][] squareArray = new int[a][a];
        for (int i = 0 ; i < squareArray.length ; i++){
            squareArray[i][i] = a;
        }
        for (int j = 0 ; j < squareArray.length ; j++){
            squareArray[j][a-1-j] = a;
        }
        for (int l = 0 ; l < squareArray.length ; l++) {
            for (int w = 0; w < squareArray[l].length; w++) {
                System.out.print(squareArray[l][w] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Задание 5

        public static void registeredArray (int len, int initialValue) {
            int [] array5 = new int [len];
            for (int i = 0 ; i < len ; i++) {
                array5[i]=initialValue;
            }
            for (int j = 0 ; j < len ; j++) {
                System.out.print(array5[j] + " | ");
            }
            System.out.println();
        }



        }

