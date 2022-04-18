package pri.lee.other;

import java.util.ArrayList;

public class PackageProblem {
    /**
     * 0-1背包问题
     * @param packageSize 背包容量
     * @param N 物品种类
     * @param goods_size 物品体积
     * @param value 物品价值
     * @return 最大的价值
     */
    public static void FirstClass(int packageSize,int N,int[] goods_size,int[] value){
        //初始化动态规划数组
        int[][] dp=new int[packageSize+1][N+1];//横坐标是背包容量，纵坐标是物品编号，用一张二维表来记录背包中物品的最大价值
        ArrayList<Integer> arrayList = new ArrayList<>();
        int Max;
        for (int i = 0; i < packageSize+1; i++) {//每次大循环开始:表示在当前背包容量下，尝试不断的放入物品，每次大循环结束后d[i][j]都是当前的最大价值
            for (int j = 1; j < N+1; j++) {//物品从编号1开始进行放入尝试,由于goods_size和value数组下标都是从0开始,故注意第i个物品的重量为goods_size[j-1],价值为value[j-1]
                if(goods_size[j-1]>i)//如果当前物品体积大于当前背包体积，装不进去,那么最大值就是装当前物品之前组合
                    dp[i][j]=dp[i][j-1];
                else //如果装得下当前物品,判断：装下之后价值更大，还是没装价值更大？取两者最大的一个
                {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-goods_size[j-1]][j-1]+value[j-1]);
                }

            }
        }
        Max=dp[packageSize][N];//遍历结束后生成的这张表，右下角的值就是所求的最大值。
        //从右下角逆序开始，寻找最大值对应的组合，j和j-1不同的，则说明j被放入了背包中，记下j的值，同时移动到dp[i-goods_size[j-1]][j-1],如相同则继续往上比dpp[i][j] dp[i][j-1]
        //如果dp[i][j]==0了则退出循环
        for (int j = N,i=packageSize; j >0; j--) {

                if (dp[i][j]!=dp[i][j-1])//上下不同
                {
                    arrayList.add(j);
                    i=i-goods_size[j-1];
                }
                if(dp[i][j]==0)
                    break;


        }

        System.out.println("最大价值为:"+Max+"\n组合为:"+arrayList.toString());
    }

    public static void main(String[] args) {
        int[]  value= {2,4,4,5};
        int[] good_size={1,2,3,4};
        FirstClass(5,4,good_size,value);
        //System.out.println(ZeroOnePack(8,4,good_size,value));

    }
}
