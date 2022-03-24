package lesson.c2;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = new Random().nextInt(10);
        System.out.println("随机数已生成");
        System.out.println(randomNumber);
        System.out.println("请输入的您要猜的数字:");

        int numGuess = sc.nextInt();
        while (numGuess != randomNumber) {
            if (numGuess > randomNumber) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
            System.out.println("请输入您要猜的数字:");
            numGuess = sc.nextInt();
        }
        System.out.println("恭喜您猜对了!!");
    }
}
