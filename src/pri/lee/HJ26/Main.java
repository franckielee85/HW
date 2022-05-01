package pri.lee.HJ26;

import java.util.Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static String function(String input){
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if(Character.isLetter(input.charAt(i))) //如果是字母则加入排序
                arrayList.add(input.charAt(i));
        }
        arrayList.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.toUpperCase(o1)-Character.toUpperCase(o2);//如果相减等于0 则说明相等，顺序即为添加顺序（符合规则1 2）
            }
        });
        StringBuilder stringBuilder = new StringBuilder();//新建一个字符串，从已经排好序的字符串中找到对应的添加进去
        for (int i = 0,j=0; i < input.length(); i++) {
            if(Character.isLetter(input.charAt(i)))
                stringBuilder.append(arrayList.get(j++));//注意这里是j++ 因为两个字符串长度不一样 原始的肯定比排序后的要长 所以要用原始的为标准（记录非字母的序号） 但是添加要另外新的变量 j控制
            else
                stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        System.out.println(function(input));

    }
}
