package exam;
import java.util.Scanner;

public class LeapYears0 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((num % 4 == 0 && num % 100 != 0) || num % 400 == 0){
            System.out.println(num + "年是闰年!");
        }else {
            System.out.println(num + "年不是闰年!");
        }
    }
}
