import java.util.Scanner;
public class TaskExample1 {
//    Пример 1. Ввести двузначное положительное целое число. Вывести его последнюю и первую цифры
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int lastDigit = number % 10; // 48 % 10 = 8
        int firstDigit = number / 10; // 48 / 10 = 4

        System.out.println(lastDigit);
        System.out.println(firstDigit);
    }
}
