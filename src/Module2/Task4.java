package Module2;

//Пользователь вводит с клавиатуры целое шестизначное число.
//Нужно определить, является ли число счастливым, и вывести YES, если это так, и NO в противном случае.
//Счастливым считается шестизначное число, у которого сумма первых трех цифр равна сумме последних трех цифр.
//Если число не шестизначное, то нужно вывести ERROR.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) number = -number;

        int number1 = number / 1000;
        int number2 = (number % 1000);

        int number11 = number1 / 100;
        int number12 = (number1 % 100) / 10;
        int number13 = (number1 % 10);

        int number21 = number2 / 100;
        int number22 = (number2 % 100) / 10;
        int number23 = (number2 % 10);

        int sum1 = number11 + number12 + number13;
        int sum2 = number21 + number22 + number23;

//        System.out.println(number11);
//        System.out.println(number12);
//        System.out.println(number13);
        if (number < 100000 || number > 999999) System.out.println("ERROR");
        else if (sum1 == sum2) System.out.println("YES");
        else System.out.println("NO");
    }
}




//Другие варианты решения:

//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int number = scan.nextInt();
//    if (number < 100000 || number > 999999) {
//        System.out.println("ERROR");
//        return;
//    }
//    int c1 = number % 10;
//    number /= 10;
//    int c2 = number % 10;
//    number /= 10;
//    int c3 = number % 10;
//    number /= 10;
//    int c4 = number % 10;
//    number /= 10;
//    int c5 = number % 10;
//    int c6 = number / 10;
//    if (c1 + c2 + c3 == c4 + c5 + c6) {
//        System.out.println("YES");
//    } else {
//        System.out.println("NO");
//    }
//}


//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int num = scan.nextInt();
//
//    if (num < 100000 || num > 999999) {
//        System.out.println("ERROR");
//        return;
//    }
//
//    int d1, d2, d3, d4, d5, d6;
//    d1 = num / 100000;
//    d2 = (num / 10000) % 10;
//    d3 = (num / 1000) % 10;
//    d4 = (num / 100) % 10;
//    d5 = (num / 10) % 10;
//    d6 = num % 10;
//
//    System.out.print(d1 + d2 + d3 == d4 + d5 + d6 ? "YES" : "NO");
//}