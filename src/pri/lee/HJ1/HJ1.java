package pri.lee.HJ1;

import java.util.Scanner;

/**
 * @author fuyao lee
 * @date 2022/4/10 10:38
 */
public class HJ1 {
    /**
     * 描述
     * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
     * 输入描述：
     * 输入一行，代表要计算的字符串，非空，长度小于5000。
     *
     * 输出描述：
     * 输出一个整数，表示输入字符串最后一个单词的长度。
     */
    public static int Function1(String input){
        String[] strings=input.split(" ");
        return strings[strings.length-1].length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        if(input.length()>5000){
            System.out.println("字符串长度大于5000");
            System.exit(1);
        }
        System.out.println(Function1(input));
    }
}
