package pri.lee.HJ28;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void function1(int N,int[] a){
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0)//奇数
                arrayList.add(a[i]);
            else {
                arrayList1.add(a[i]);
            }
        }
        //下标对应已经匹配的偶数的下标，值对应这个偶数的伴侣
        int[] matcheven=new int[arrayList1.size()];
        //记录伴侣的对数
        int count=0;
        for(int j=0;j<arrayList.size();j++){
            //用于标记对应的偶数是否查找过
            boolean[] v=new boolean[arrayList1.size()];
            //如果匹配上，则计数加1
            if(find(arrayList.get(j),matcheven,arrayList1,v)){
                count++;
            }
        }
        System.out.println(count);
    }
    //判断奇数x能否找到伴侣
    private static boolean find(int x,int[] matcheven,ArrayList<Integer> evens,boolean[] v){
        for(int i=0;i<evens.size();i++){
            //该位置偶数没被访问过，并且能与x组成素数伴侣
            if(isPrime(x+evens.get(i))&&v[i]==false){
                v[i]=true;
                /*如果i位置偶数还没有伴侣，则与x组成伴侣，如果已经有伴侣，并且这个伴侣能重新找到新伴侣，
                则把原来伴侣让给别人，自己与x组成伴侣*/
                if(matcheven[i]==0||find(matcheven[i],matcheven,evens,v)){
                    matcheven[i]=x;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isPrime(int n)

    {
        if(n < 2) return false;

        if(n == 2) return true;

        if(n%2==0) return false;

        for(int i = 3; i < n; i += 2)

            if(n%i == 0) return false;

        return true;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ints = new int[N];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=scanner.nextInt();
        }
        function1(N,ints);
    }
}