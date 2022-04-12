package pri.lee.HJ108;



import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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

    /**
     * 描述
     * 数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
     *
     *
     * 提示:
     * 0 <= index <= 11111111
     * 1 <= value <= 100000
     *
     * 输入描述：
     * 先输入键值对的个数n（1 <= n <= 500）
     * 接下来n行每行输入成对的index和value值，以空格隔开
     *
     * 输出描述：
     * 输出合并后的键值对（多行）
     */
    public static void Function8(){
        Scanner scanner = new Scanner(System.in);
        int tableSize = scanner.nextInt();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < tableSize; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (treeMap.containsKey(key)) {
                treeMap.put(key, treeMap.get(key) + value);
            } else {
                treeMap.put(key, value);
            }
        }
        for (Integer key : treeMap.keySet()) {
            System.out.println( key + " " + treeMap.get(key));
        }
    }
    public static void main(String[] args) {

    }
}
