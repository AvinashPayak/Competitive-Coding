import java.util.*;

public class B409 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            String x = pp.next();
            String z = pp.next();
            String y = "";
            boolean flag = true;
            for(int i=0;i<x.length();i++){
                if(x.charAt(i) < z.charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag == false) System.out.println(-1);
            else System.out.println(z);
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

