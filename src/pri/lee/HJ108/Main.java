package pri.lee.HJ108;


import java.util.Scanner;

/**
 * @author fuyao lee
 * @date 2022/4/12 15:30
 */
public class Main {
    /**
     * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整。
     * 数据范围：保证输入的数字在 32 位浮点数范围内
     * @param input
     * @return
     */
    public static int Function7(float input){
        int result=Math.round(input);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float input=scanner.nextFloat();
        System.out.println(Function7(input));
    }
}
