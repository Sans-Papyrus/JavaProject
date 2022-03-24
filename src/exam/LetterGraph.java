/**
 * @author: K
 * @version: 1.5
 * @since  1.0
 */

package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetterGraph {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String s = str.readLine();
        String[] st = s.split(" ");
        char[] c = new char[Integer.parseInt(st[1])];
        int time = 0;
        int timeMax = Integer.parseInt(st[0]);
        for (int i = 0; i < c.length; i ++) {
            c[i] = (char) ('B' + i);
        }

        for (int k = 0; k < timeMax; k ++){
            for (int j = 0; j < c.length; j++){
                if (j < time) {
                    c[j] = (char) (c[j] + 1);
                }
                if (j >= time) {
                    c[j] = (char) (c[j] - 1);
                }
            }
            time++;
            System.out.print(c);
            System.out.println();
        }
    }
}
