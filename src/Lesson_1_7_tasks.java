import java.util.Locale;
import java.util.Scanner;

public class Lesson_1_7_tasks {
    public static void main(String[] args) {
//        Пользователь вводит с клавиатуры денежную сумму в рублях и копейках (рубли и копейки вводятся в разные переменные).
//        Программа должна откорректировать введенную сумму в правильную форму.
//        Например, если пользователь ввел 22 и 978, то программа должна вывести 31 р. 78 к.
//        https://stepik.org/lesson/813895/step/9?unit=817206

//        Scanner scanner = new Scanner(System.in);
//        int rouble = scanner.nextInt();
//        int kop = scanner.nextInt();
//        rouble = rouble + kop / 100;
//        kop = kop % 100;
//        System.out.printf("%02d руб. %02d коп.", rouble, kop);



//        В отделе работают 3 сотрудника, которые получают заработную плату в рублях.
//        Требуется определить, на сколько зарплата самого высокооплачиваемого из них отличается от самого низкооплачиваемого.
//        Пользователь вводит три целых числа (три зарплаты в рублях).
//        Программа выводит разность зарплат в рублях.
//        Используйте тернарную операцию!
//        https://stepik.org/lesson/813895/step/10?unit=817206

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        int max = a > b ? a : b;
//        max = max > c ? max : c;
//        int min = a < b ? a : b;
//        min = min < c ? min : c;
//        int result = max - min;
//        System.out.println(result);



//        На вход программы подается размер интервала времени в секундах.
//        Переведите это в часы, минуты и секунды и выведите согласно примеру теста.
//        https://stepik.org/lesson/813895/step/11?unit=817206

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int hours = number / 3600;
//        int minutes = number % 3600 / 60;
//        int seconds = number % 3600 % 60;
//        System.out.printf("%d часов %d минут %d секунд", hours, minutes, seconds);



//        Вычислите стоимость товара с учетом скидки.
//        Пользователь вводит цену товара в виде двух целых чисел через пробел (рубли копейки).
//        В следующей строке он вводит размер скидки в процентах (также целое число).
//        Цену нужно вывести так, как показано в тесте.
//        https://stepik.org/lesson/813895/step/12?unit=817206
//
//        Учтите, что здесь не применяется округление по правилам математики.
//        Стоимость товара всегда учитывается в большую сторону.
//
//        При выводе число рублей и копеек выводится в двух позициях
//        (т.е. 00 коп., если копеек нет).

//        Scanner scanner = new Scanner(System.in);
//        int rouble = scanner.nextInt();
//        int kop = scanner.nextInt();
//        int discount = scanner.nextInt();
//
//        int price = rouble * 100 + kop;
//        price = price - (price * discount / 100);
//
//        rouble = price / 100;
//        kop = price % 100;
//
//        System.out.printf("%02d руб. %02d коп.", rouble, kop);



//        Напишите программу, которая вычисляет значение функции.
//        Вычисляется натуральный логарифм от суммы x и произведения 7
//        на корень квадратный из следующего выражения: x в четвертой степени плюс число Пи.
//        При выводе значение функции представьте с четырьмя знаками после десятичной точки.
//        https://stepik.org/lesson/813895/step/15?unit=817206

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        x = Math.log(x + 7 * Math.sqrt(Math.pow(x, 4) + Math.PI));
        System.out.printf("%.4f", x);

    }
}
