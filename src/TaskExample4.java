import java.util.Scanner;

public class TaskExample4 {
//    Пример 4. Зарплата менеджера составляет 100 $ плюс 5% от продаж.
//    Пользователь вводит общую сумму сделок менеджера за месяц (в долларах).
//    Определить итоговую зарплату менеджера в долларах (используйте целые числа).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        final int BASA = 100;
        final int PROCENT = 5; // первый вариант
//        final double PROCENT = 0.05; или если сделать процент вещественным

       int salary = BASA + sum * PROCENT / 100; // первый вариант
// или       int salary =  BASA + (int) (sum *  PROCENT);   если сделать процент вещественным
// или       int salary =  (int) (BASA + sum *  PROCENT);   если сделать процент вещественным

        System.out.println(salary);
    }
}
