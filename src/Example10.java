import java.util.Locale;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
//        в русской локали дробную часть нужно отделять запятой,
//        чтобы поменять локаль на английскую, напишем строчку:
        Locale.setDefault(Locale.US); // теперь при вводе и при выводе будет точка
        double x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = Math.sqrt(2) / 2 * Math.sin(x / 2 + Math.PI);
        System.out.println(y);
        System.out.printf("%.4f",y); // если хотим форматировать вывод значения.
        // В данном случае округлим до 4-х знаков после точки
    }
}
