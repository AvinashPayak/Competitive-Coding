import java.util.Scanner;
import java.lang.Math;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            long n = pp.nextLong();
            System.out.println(largestprime(n));
        }
        pp.close();
    }
    static long largestprime(long n){
        while(n%2==0){
            n = n/2;
        }
        if(n==1){
            return 2;
        }
        else{
            long i;
            for(i=3;i<=(long)Math.sqrt(n);i=i+2){
                while(n%i==0){
                    n /=i;
                }
            }
            if(n>2){
                return n;
            }
            else{
                return i-2;
            }
        }
    }
}
