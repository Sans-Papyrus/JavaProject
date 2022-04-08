package lesson.c3;

import java.util.Scanner;

public class CheckNarcissisticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isNarcissisticNumber(num));
    }

    public static boolean isNarcissisticNumber(int n) {
        int ones = n % 10;
        int tens = n / 10 % 10;
        int hundreds = n / 100;
        int sum = (ones * ones * ones) + (tens * tens * tens) + (hundreds * hundreds * hundreds);
        return sum == n;
    }
}
