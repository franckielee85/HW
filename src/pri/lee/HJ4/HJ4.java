package pri.lee.HJ4;

import java.util.Scanner;

public class HJ4 {
    /**
     *
     * 描述
     * •输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；
     *
     * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
     * 输入描述：
     * 连续输入字符串(每个字符串长度小于等于100)
     *
     * 输出描述：
     * 依次输出所有分割后的长度为8的新字符串
     *
     * abc
     *
     * abc00000
     */
    public static void Funtion1(String input){
        int zero=input.length()%8;
        StringBuilder stringBuilder = new StringBuilder(input);
        if(zero!=0)
            for (int i = 0; i < 8 - zero; i++) {
                stringBuilder.append(0);
            }
        int n=stringBuilder.length()/8;
        String string = stringBuilder.toString();
        for (int i = 0; i < n; i++) {
            System.out.println(string.substring(0,8));
            string=string.substring(8);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Funtion1(line);
    }
}
