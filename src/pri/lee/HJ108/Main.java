package pri.lee.HJ108;



import java.util.*;

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

    /**
     * 描述
     * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
     * 保证输入的整数最后一位不是 0 。
     *
     * 数据范围： 1 \le n \le 10^{8} \1≤n≤10
     * 8
     *
     * 输入描述：
     * 输入一个int型整数
     *
     * 输出描述：
     * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
     * 9876673
     * 37689
     */
    public static void Function9(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        char[] charArray = stringBuilder.reverse().toString().toCharArray();
        Set<Character> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[charArray.length-1]=='0')
                break;
            hashSet.add(charArray[i]);
        }
        Iterator<Character> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }

    /**
     * 描述
     * 编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
     * 例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。
     *
     * 数据范围： 1 \le n \le 500 \1≤n≤500
     * 输入描述：
     * 输入一行没有空格的字符串。
     *
     * 输出描述：
     * 输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。
     *
     */
    public static int Function10(String input){
        char[] charArray = input.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            hashSet.add(charArray[i]);
        }

        return hashSet.size();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( Function10(scanner.nextLine()));
    }
}
