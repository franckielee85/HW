package pri.lee.other;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubSequence {
    public static int longestSubSequence(int N,int[] nums) {
        int[] dp = new int[nums.length];
        int[] dp2 = new int[nums.length];
        int[] dp3 = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {//每次从这轮循环中找对应这个数结尾这个情况下，最长递增子序列
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {//如果后面的数比前面的大，说明可以放到后面组成子序列
                    dp[i] = Math.max(dp[i], dp[j] + 1);//形成一个新的递增子序列，而且这个新的子序列长度加一。
                }
            }
        }
        Arrays.fill(dp2, 1);
        for (int i = nums.length-1; i >0; i--) {//每次从这轮循环中找对应这个数开头这个情况下，最长递减子序列
            for (int j = nums.length-1; j >i; j--) {
                if (nums[j] < nums[i]) {//如果后面的数比前面的小，说明可以放到后面组成子序列
                    dp2[i] = Math.max(dp2[i], dp2[j] + 1);//形成一个新的递减子序列，而且这个新的子序列长度加一。
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            dp3[i] = dp[i] + dp2[i] - 1;//对应的每个位置作为中轴所形成的最长子序列的长度
        }
        Arrays.sort(dp3);
        return nums.length - dp3[dp.length - 1];
    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] ints = new int[i];
        for (int j = 0; j < ints.length; j++) {
            ints[j]=scanner.nextInt();
        }
        System.out.println(longestSubSequence(i,ints));
    }
}
