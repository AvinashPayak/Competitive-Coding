import java.util.*;

public class A693 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int w = pp.nextInt();
            int h = pp.nextInt();
            int n = pp.nextInt();
            int count = 1;
            while(w%2 ==0){
                count*=2;
                w=w/2;
            }
            while(h%2==0){
                count*=2;
                h=h/2;
            }
            if(count >= n) System.out.println("YES");
            else System.out.println("NO");
        }
        
        pp.close();
    }

    static short countBits(int n){
        short count = 0;
        while(n!=0){
            count+=(n & 1);
            n >>>= 1;
        }
        return count;
    }

    static short parity(int n){
        short result = 0;
        while(n!=0){
            result ^= 1;
            n &= n-1;
        }
        return result;
    }

    static long swapBits(long n, int i, int j){
        if(((n >>> i) & 1) != ((n >>> j) & 1)){
            long bitMask = ((1L << i) | (1L << j));
            n ^= bitMask;
        }
        return n;
    }
}