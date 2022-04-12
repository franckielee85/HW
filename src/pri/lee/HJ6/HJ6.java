package pri.lee.HJ6;

/**
 * @author fuyao lee
 * @date 2022/4/12 13:10
 * 描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 *
 *
 * 数据范围： 1 \le n \le 2 \times 10^{9} + 14 \1≤n≤2×10
 * 9
 *  +14
 * 输入描述：
 * 输入一个整数
 *
 * 输出描述：
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。
 */
public class HJ6 {
    /**
     * 判断是否为质数
     */
    public static boolean  Fucntion1(int input) {
        boolean flag=false;
        for (int i = 2; i < (int) Math.sqrt(input); i++) {
            if (input%2==0){
                flag=false;//不是质数
                break;
            }
            else {
                flag=true;//是质数
                break;
            }
        }
        return flag;
    }

    /**
     * 找质数因子
     * @return
     */
    public static void  Fucntion2(int input){
        if (input==1)
            System.out.println(1);
        for (int i = 2; i <=input; i++){
            while (input%i==0){
                System.out.println(i+" ");
                input=input/i;
            }
        }
    }
    public static void main(String[] args) {
        Fucntion2(180);
    }
}
