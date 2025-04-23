package Module2;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

//Пользователь вводит координаты двух точек на плоскости
// (в первой строке через пробел - координата X и координата Y первой точки,
// затем во второй строке также через пробел координаты второй точки).
// Нужно определить, какая из точек ближе к началу координат.
//Выводится одно из сообщений: "Первая точка ближе", "Вторая точка ближе", "Точки на равных расстояниях".
//Подсказка: расстояние до начала координат находится по формуле:
//https://stepik.org/lesson/832205/step/4?unit=835781


public class Task2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
//        double x1, y1, x2, y2;
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double d1 = sqrt(pow(x1, 2) + pow(y1, 2));
        double d2 = sqrt(pow(x2, 2) + pow(y2, 2));

        if (d1 < d2) {
            System.out.println("Первая точка ближе");
        } else if (d1 > d2) {
            System.out.println("Вторая точка ближе");
        } else {
            System.out.println("Точки на равных расстояниях");
        }
    }
}
