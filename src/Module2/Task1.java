package Module2;

import java.util.Scanner;

//Пользователь вводит целое число.
//Определить, является ли оно четным. Если число четное, нужно вывести YES, а если нечетное NO
//https://stepik.org/lesson/832205/step/3?unit=835781

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.print("YES");
        } else
            System.out.print("NO");
    }
}
