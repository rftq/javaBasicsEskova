package Module2;

public class Runner {
    public static void main(String[] args) {
        double three = 3.0;
        double x = 1 / three;
        double y = 4 / three;
        double z = 5 / three;
        if (x + y == z) { // if (Math.abs(x + y - z) < 1e-6)
            System.out.println("1/3 + 4/3 = 5/3");
        } else {
            System.out.println("1/3 + 4/3 != 5/3");
        }
    }
}
