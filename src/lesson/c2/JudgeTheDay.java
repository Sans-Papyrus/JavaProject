package lesson.c2;

import java.util.Scanner;
public class JudgeTheDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDay = sc.nextInt();
        switch (numDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("加油，打工人!");
                break;
            case 6:
            case 7:
                System.out.println("今天可以摸摸鱼了。");
                break;
            default:
                System.out.println("不存在星期" + numDay);
        }
    }
}
