package pri.lee.HJ29;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String function1(String context,String encrypt) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < context.length(); i++) {
            if(Character.isLetter(context.charAt(i))) {

                if (Character.isUpperCase(context.charAt(i)))//如果是大写
                {
                    if (context.charAt(i) == 'Z'){
                        stringBuilder.append('a');
                        continue;
                    }

                    stringBuilder.append((char) Character.toLowerCase(context.charAt(i) + 1));//转化成小写
                } else if (Character.isLowerCase(context.charAt(i)))//如果是小写
                {
                    if (context.charAt(i) == 'z'){
                        stringBuilder.append('A');
                        continue;
                    }

                    stringBuilder.append((char) Character.toUpperCase(context.charAt(i) + 1));//转化成大写
                }
            }
            else if(Character.isDigit(context.charAt(i))) {
                    if (context.charAt(i) == '9'){
                        stringBuilder.append('0');
                        continue;
                    }
                    stringBuilder.append(context.charAt(i)-'0'+1);
                }
            else {
            stringBuilder.append(context.charAt(i));
        }
        }
        for (int i = 0; i < encrypt.length(); i++) {
            if(Character.isLetter(encrypt.charAt(i))) {

                if (Character.isUpperCase(encrypt.charAt(i)))//如果是大写
                {
                    if (encrypt.charAt(i) == 'A'){
                        stringBuilder1.append('z');
                        continue;
                    }
                    stringBuilder1.append((char) Character.toLowerCase(encrypt.charAt(i) - 1));//转化成小写
                } else if (Character.isLowerCase(encrypt.charAt(i)))//如果是小写
                {
                    if (encrypt.charAt(i) == 'a'){
                        stringBuilder1.append('Z');
                        continue;
                    }

                    stringBuilder1.append((char) Character.toUpperCase(encrypt.charAt(i) - 1));//转化成大写
                }
            }
            else if(Character.isDigit(encrypt.charAt(i))) {
                if (encrypt.charAt(i) == '0') {
                    stringBuilder1.append('9');
                    continue;
                }
                stringBuilder1.append(encrypt.charAt(i)-'0'-1);
            }
            else {
                stringBuilder1.append(encrypt.charAt(i));
            }
        }

        return stringBuilder.toString()+"\n"+stringBuilder1.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();

        System.out.println(function1(s,s1));
    }
}
