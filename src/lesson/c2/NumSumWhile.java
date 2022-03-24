package lesson.c2;

public class NumSumWhile {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;
        while (i <= 200) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
