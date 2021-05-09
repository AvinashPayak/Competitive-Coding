import java.util.*;

public class B524 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int l = pp.nextInt();
            int r = pp.nextInt();
            int lsum = 0;
            int rsum = 0;
            l--;
            if(l%2 == 0) lsum = l/2;
            else lsum = (l-1)/2 - l;

            if(r%2 == 0) rsum = r/2;
            else rsum = (r-1)/2 - r;

            System.out.println(rsum-lsum);
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

