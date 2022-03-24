package exam;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[num + 2];
        a[1] = a[2] = 1;
        if (num == 1){
            a[num] = 1;
        }else if (num == 2){
            a[num] = 1;
        }else {
            for (int i = 3; i <= num; i ++){
                a[i] = (a[i - 1] + a[i - 2]) % 10007;
            }
        }
        System.out.println(a[num]);
    }
}
