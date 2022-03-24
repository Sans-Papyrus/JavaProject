package powernodelesson.datatype.datatype;

public class DataTypeChar {
    public static void main(String[] args) {
        // '\'为转义字符。
        char a = '\'';  //输出单引号
        char x = '云';
        char n = '\n';  //换行
        char t = '\t';  //制表符
        char y = '菁';
        char k = '\\';  //输出反斜杠
        char m = '\u4e2d';
        System.out.print(a);
        System.out.print(x);
        System.out.print(n);
        System.out.print(t);
        System.out.print(y);
        System.out.print(k);
        System.out.print(n);
        System.out.println("\"Hello,World!\"");
        System.out.println("'Hello,World!'");
        System.out.println(m);
        System.out.println('\u0000');
    }
}
