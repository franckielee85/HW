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
     *
     * @param input
     * @return
     */
    public static int Function7(float input) {
        int result = Math.round(input);
        return result;
    }

    /**
     * 描述
     * 数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
     * <p>
     * <p>
     * 提示:
     * 0 <= index <= 11111111
     * 1 <= value <= 100000
     * <p>
     * 输入描述：
     * 先输入键值对的个数n（1 <= n <= 500）
     * 接下来n行每行输入成对的index和value值，以空格隔开
     * <p>
     * 输出描述：
     * 输出合并后的键值对（多行）
     */
    public static void Function8() {
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
            System.out.println(key + " " + treeMap.get(key));
        }
    }

    /**
     * 描述
     * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
     * 保证输入的整数最后一位不是 0 。
     * <p>
     * 数据范围： 1 \le n \le 10^{8} \1≤n≤10
     * 8
     * <p>
     * 输入描述：
     * 输入一个int型整数
     * <p>
     * 输出描述：
     * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
     * 9876673
     * 37689
     */
    public static void Function9(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        char[] charArray = stringBuilder.reverse().toString().toCharArray();
        Set<Character> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[charArray.length - 1] == '0')
                break;
            hashSet.add(charArray[i]);
        }
        Iterator<Character> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }


    /**
     * 描述
     * 编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
     * 例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。
     * <p>
     * 数据范围： 1 \le n \le 500 \1≤n≤500
     * 输入描述：
     * 输入一行没有空格的字符串。
     * <p>
     * 输出描述：
     * 输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。
     */
    public static int Function10(String input) {
        char[] charArray = input.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            hashSet.add(charArray[i]);
        }

        return hashSet.size();
    }

    /**
     * 描述
     * 输入一个整数，将这个整数以字符串的形式逆序输出
     * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
     * <p>
     * <p>
     * 数据范围： 0 \le n \le 2^{30}-1 \0≤n≤2
     * 30
     * −1
     * 输入描述：
     * 输入一个int整数
     * <p>
     * 输出描述：
     * 将这个整数以字符串的形式逆序输出
     */
    public static String Function11(int input) {
        Integer integer = new Integer(input);
        StringBuilder stringBuilder = new StringBuilder(integer.toString());
        return stringBuilder.reverse().toString();

    }

    /**
     * 描述
     * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
     * <p>
     * 输入描述：
     * 输入一行，为一个只包含小写字母的字符串。
     * <p>
     * 输出描述：
     * 输出该字符串反转后的字符串。
     *
     * @param input
     * @return
     */
    public static String Function12(String input) {
        StringBuilder stringBuilder = new StringBuilder(input.toLowerCase());
        return stringBuilder.reverse().toString();

    }

    /**
     * 描述
     * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
     * <p>
     * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
     * <p>
     * 数据范围：输入的字符串长度满足 1 \le n \le 1000 \1≤n≤1000
     * <p>
     * 注意本题有多组输入
     * 输入描述：
     * 输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。
     * <p>
     * 输出描述：
     * 得到逆序的句子
     *
     * @param input
     * @return
     */
    public static void Function13(String input) {
        String[] split = input.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            System.out.print(split[i] + " ");
        }
    }

    /**
     * 描述
     * 给定 n 个字符串，请对 n 个字符串按照字典序排列。
     * <p>
     * 数据范围： 1 \le n \le 1000 \1≤n≤1000  ，字符串长度满足 1 \le len \le 100 \1≤len≤100
     * 输入描述：
     * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
     * 输出描述：
     * 数据输出n行，输出结果为按照字典序排列的字符串。
     *
     * @param N
     */
    public static void Function14(int N) {
        Scanner scanner = new Scanner(System.in);
        String[] stringBuilder = new String[N];
        for (int i = 0; i < stringBuilder.length; i++) {
            stringBuilder[i] = scanner.nextLine();
        }
        Arrays.sort(stringBuilder);
        for (String i : stringBuilder
        ) {
            System.out.println(i);
        }
    }

    /**
     * 描述
     * 输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数。
     * <p>
     * 数据范围：保证在 32 位整型数字范围内
     * 输入描述：
     * 输入一个整数（int类型）
     * <p>
     * 输出描述：
     * 这个数转换成2进制后，输出1的个数
     *
     * @param input
     * @return
     */
    public static int Function15(int input) {
        String string = Integer.toBinaryString(input);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '1')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        //Function14(scanner.nextInt());
        //System.out.println(Function15(scanner.nextInt()));

        arrayList.add("google");
        arrayList.add("asd");
        arrayList.add("jjj");
        arrayList.clear();
        //Collections.sort((List) arrayList);
        for (String s :
                arrayList) {
            System.out.println(s);
        }

    }
}
