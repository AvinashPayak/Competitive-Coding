import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            int c0= pp.nextInt();
            int c1 = pp.nextInt();
            int h = pp.nextInt();
            String s = pp.next();
            int count0 = 0;
            int count1 = 0;

            for(int i = 0;i<n;i++){
                if(s.charAt(i) == '0'){
                    count0++;
                }
                else{
                    count1++;
                }
            }
            int ans = cost(n,c0,c1,h,count0,count1);
            System.out.println(ans);
            
        }
        pp.close();
    }

    static int cost(int n, int c0, int c1, int h, int count0, int count1){
        if(c0==c1){
            return c0*n;
        }
        else{
            int min = Math.min(Math.min((n*c0 +count1*h),(n*c1 + count0*h)),(count1*c1+count0*c0));
            return min;
        }
        
    }

}