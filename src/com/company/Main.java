package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("Hi," + s);*/

        /*for (int i = args.length-1; i >=0; i--) {
            System.out.println(args[i]);
        }*/
/*
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество случайных чисел");
        int countOfNubmers = scanner.nextInt();
        for (int i = 0; i < countOfNubmers; i++) {
            int n = rand.nextInt(10);
//            System.out.println(n);
            System.out.print(n + " ");
        }*/


       /* String s="1234";
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        if (s.equals(password)) {
            System.out.println("пароль совпал");
        }
        else System.out.println("пароль не совпал");*/


     /*   int sum1 = 0;
        int product = 1;
        for (int i = 0; i < args.length; i++) {
            int element1 = Integer.parseInt(args[i]);

            sum1 = sum1 + element1;
            product = product * element1;

        }
        System.out.println("сумма "+sum1);
        System.out.print("произведение "+product);*/


   /*     Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        System.out.println("введите масив");
       *//* for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();

            if (myArray[i] % 2 == 0) {
                System.out.println("Четные: "+ myArray[i]);
            }

        }*//*
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();

            if (myArray[i] % 2 != 0) {
                System.out.println("Нечетные: "+ myArray[i]);
            }

        }*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        System.out.println("введите масив");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
            if (max < myArray[i]) max = myArray[i];
            if (min > myArray[i]) min = myArray[i];
        }
        System.out.println("максимум: " + max + " " + "минимум: " + min);*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        System.out.println("введите масив");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
            if (myArray[i] % 3 == 0 || myArray[i] % 9 == 0) {
                System.out.println(myArray[i]);
            }
        }*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        System.out.println("введите масив");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
            if (myArray[i] % 5 == 0 && myArray[i] % 7 == 0) {
                System.out.println(myArray[i]);
            }
        }*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        System.out.println("введите масив");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
            int partOfNumber1 = myArray[i] % 10;
            int intermediateNumber = myArray[i] / 10;
            int partOfNumber2 = intermediateNumber % 10;
            int partOfNumber3 = intermediateNumber / 10;

            if (partOfNumber1 != partOfNumber2 && partOfNumber2 != partOfNumber3 && partOfNumber1 != partOfNumber3) {
                System.out.println(myArray[i]);
            }
        }*/

    /*    Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String rightSide = s.substring(s.length() / 2);
        String leftSide = s.substring(0, s.length() / 2);
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < rightSide.length(); i++) {
            int partOfNumber = Integer.parseInt(rightSide.substring(i, i + 1));
            sum1 += partOfNumber;
        }
        for (int i = 0; i < leftSide.length(); i++) {
            int partOfSecondNumber=Integer.parseInt(leftSide.substring(i,i+1));
            sum2 +=partOfSecondNumber;
        }

        if (sum1 == sum2) {
            System.out.println("У вас счастливое число: "+s);
        }
        else System.out.println("У вас несчастливое число");*/


        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length()) {
                int middleNumber = Integer.parseInt(s.substring(i + 1, i + 2));
                int leftNumber = Integer.parseInt(s.substring(i, i + 1));
                int rightNumber = Integer.parseInt(s.substring(i + 2, i + 3));
                int sum = leftNumber + rightNumber;
                if (middleNumber == sum) {
                    System.out.println(middleNumber);
                }
            }
        }
    }

}

