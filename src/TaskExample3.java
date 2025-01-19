import java.util.Locale;
import java.util.Scanner;

public class TaskExample3 {
//    Пример 3. Ввести два вещественных числа. Найти максимальное из них.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        System.out.println(number1 > number2 ? number1 : number2);
    }
}
