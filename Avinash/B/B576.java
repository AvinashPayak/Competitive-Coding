import java.util.*;
import java.text.DecimalFormat;

public class B576 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        double H = pp.nextDouble();
        double L = pp.nextDouble();
        double x = (L*L - H*H)/(2*H);
        DecimalFormat dec = new DecimalFormat("#0.000000000000");
        System.out.println(dec.format(x));
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

