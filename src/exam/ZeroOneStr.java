package exam;

public class ZeroOneStr {
    public static void main(String[] args) {
        for (int str1 = 0; str1 <=1; str1 ++){
            for (int str2 = 0; str2 <=1; str2 ++){
                for (int str3 = 0; str3 <=1; str3 ++) {
                    for (int str4 = 0; str4 <=1; str4 ++) {
                        for (int str5 = 0; str5 <= 1; str5 ++){
                            StringBuffer str = new StringBuffer();
                            System.out.println(str.append(str1).append(str2).append(str3).append(str4).append(str4).append(str5));
                        }
                    }
                }
            }
        }
    }
}
