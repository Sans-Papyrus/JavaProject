package lesson.c2;

public class Method01 {
    public static void main(String[] args) {
        printRectangle(3, 5);
        printRectangle(4, 10);
        printRectangle(2,5);
    }

    public static void printRectangle(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
