package exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SummationFormula {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        long i = Integer.parseInt(str.readLine());
        long sum = (1 + i) * i / 2;
        System.out.println(sum);
    }
}
