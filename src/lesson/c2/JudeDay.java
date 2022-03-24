package lesson.c2;

import java.util.Scanner;

public class JudeDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numD = sc.nextInt();
        switch (numD) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("加油吧，打工人!");
                break;
            case 6:
            case 7:
                System.out.println("可以摸摸鱼了!");
                break;
            default:
                System.out.println("有这天吗?");
                break;
        }
    }
}
