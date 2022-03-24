package lesson;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Exam2 {
    public static void main(String @NotNull [] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        int numA;
        int numB;
        numA = Integer.parseInt(args[0]);
        numB = Integer.parseInt(args[1]);
//        int numA = scanner.nextInt();
//        int numB = scanner.nextInt();
        result = numA > numB ? numA : numB;
//        result = Math.max(numA, numB);
        System.out.println("两个数中的最大值是:" + result);
    }
}
