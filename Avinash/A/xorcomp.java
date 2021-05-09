import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            long x = pp.nextInt();
            long y = pp.nextInt();
            long n = pp.nextInt();
            long count =0;
            for(long i = 0;i<=n;i++){
                if((i^x) < (i^y)){
                    count++;
                }
            }
            System.out.println(count);
        }
        pp.close();
    }
}