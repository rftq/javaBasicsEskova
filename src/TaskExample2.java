import java.util.Scanner;

public class TaskExample2 {
//    Пример 2. Пользователь вводит с клавиатуры объем флешки в гигабайтах.
//    Подсчитать, сколько на нее поместиться фильмов со средним размером 760 Mб
//    и музыкальных клипов объемом 95 Мб. При этом сначала на флешку записываются фильмы,
//    пока для них есть место. Когда фильмы уже не помещаются (но место еще осталось),
//    далее записываются клипы. Также подсчитать, какой объем (в Мб) останется в конце.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int volume = scan.nextInt();
        volume *= 1024;

        final int FILM = 760;
        final int CLIP = 95;

        int numberFilm = volume / FILM;
        volume %= FILM;
        int numberClip = volume / CLIP;
        volume %= CLIP;

        System.out.println(numberFilm);
        System.out.println(numberClip);
        System.out.println(volume);
    }
}
