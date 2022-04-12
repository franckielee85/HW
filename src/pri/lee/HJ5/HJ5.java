package pri.lee.HJ5;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author fuyao lee
 * @date 2022/4/12 9:13
 */

public class HJ5 {
    /**
     * 描述
     * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
     *
     * 数据范围：保证结果在 11≤n≤2 31
     *  −1
     * 输入描述：
     * 输入一个十六进制的数值字符串。
     *
     * 输出描述：
     * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
     *
     * 0xAA
     *
     * 170
     */
    public static int Function1(String input){
        input=input.toUpperCase(Locale.ROOT).substring(2);//去掉前面两位后，全部转为大写
        StringBuilder stringBuilder = new StringBuilder(input);
        char[] chars = stringBuilder.reverse().toString().toCharArray();//改变顺序从低位开始计算
        int result=0,num;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>=65){
                num=chars[i]-65+10;//包含字母则进行转化
            }else {
                num = Integer.parseInt(String.valueOf(chars[i]));//直接转化为数字
            }

            result=result+num*(int)Math.pow(16,i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        System.out.println(Function1(c));
    }
}
