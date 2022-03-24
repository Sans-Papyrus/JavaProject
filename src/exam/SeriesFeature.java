package exam;

import java.io.*;

public class SeriesFeature {
    public static void main(String[] args) throws Exception {
        int n;
        int sum = 0;
        String str0 = null;
        String str1 = null;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        str0 = buff.readLine();
        n = Integer.parseInt(str0);

        str1 = buff.readLine();
        String[] a = str1.split(" ");
        int[] array2 = new int[n];
        for (int i = 0; i < n; i ++) {
            array2[i] = Integer.parseInt(a[i]);
            sum += array2[i];
        }

        java.util.Arrays.sort(array2);
        System.out.println(array2[n - 1]);
        System.out.println(array2[0]);
        System.out.println(sum);
    }
}
