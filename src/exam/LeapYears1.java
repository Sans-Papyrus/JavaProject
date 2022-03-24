package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYears1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(str.readLine());
        if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            System.out.print("yes");
        }else {
            System.out.print("no");
        }
    }
}
