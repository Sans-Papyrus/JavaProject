package lesson.c2;

public class DoWhileSum {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;
        do {
            sum += i;
            i++;
        }while (i <= 200);
        System.out.println(sum);
    }
}
