import java.util.Scanner;
import java.math.BigInteger; 

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            BigInteger ans = new BigInteger("1");

            for(int i=1;i<=n;i++){
                ans = ans.multiply(BigInteger.valueOf(i));
            }
            System.out.println(ans);
        }
        pp.close();
    }
}