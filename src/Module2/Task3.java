package Module2;

//Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.
//Если число не является трехзначным, вывести "ERROR".
//Если нечетных цифр нет, то вывести "NO".
//Тестовые данные
//P.S. Если число отрицательное, то знак нужно отбросить перед вычислением цифр.
//https://stepik.org/lesson/832205/step/6?unit=835781

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) number = -number;
        if (number < 100 || number > 999) { //неверные исходные данные
            System.out.println("ERROR");
            return; //прекращение работы программы
        }
        //поиск суммы нечетных цифр
        int number1 = number / 100;
        int number2 = (number % 100) / 10;
        int number3 = (number % 10);

        int sum = 0;

        if (number1 % 2 > 0) sum += number1;
        if (number2 % 2 > 0) sum += number2;
        if (number3 % 2 > 0) sum += number3;
        if (sum == 0) System.out.println("NO");
        else System.out.println(sum);
    }
}