package pri.lee.HJ2;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

/**
 * @author fuyao lee
 * @date 2022/4/10 12:22
 */
public class HJ2 {
    /**
     * 描述
     * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
     *
     * 数据范围： 1≤n≤1000
     * 输入描述：
     * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字符。
     *
     * 输出描述：
     * 输出输入字符串中含有该字符的个数。（不区分大小写字母）
     *
     * 示例1
     * 输入：
     * ABCabc
     * A
     * 输出：
     * 2
     */
    public static int Function1(String input1,char input2){
        int count=0;
        char l;
        String lowerCase = input1.toLowerCase();//全部转化为小写
        if(Character.isUpperCase(input2))//如果是大写
             l=toLowerCase(input2);//转化成小写
        else {//如果不是大写则传递然后比较
            l=input2;
        }
        char[] input_array = lowerCase.toCharArray();
        for (int i = 0; i < input_array.length; i++) {
            if(l==input_array[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        char input2 = scanner.nextLine().charAt(0);
        System.out.println(Function1(input1,input2));
    }
}
