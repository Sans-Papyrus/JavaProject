package lesson.c2;

public class MethodReload01 {
    public static void main(String[] args) {
        int sum1 = add(2,3);
        int sum2 = add(2,3, 4);
        double sum3 = add(2.3, 4.4);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    public static int add(int x, int y) {
        return x + y;
    }
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static double add(double x, double y) {
        return x + y;
    }
}
