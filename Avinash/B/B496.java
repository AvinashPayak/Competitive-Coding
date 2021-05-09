import java.util.*;

public class B496 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        String l = pp.next();
        String r = pp.next();
        int i,j;
        for(i=l.length()-1,j=r.length()-1;i>=0 && j>=0 ;i--,j--){
            if(l.charAt(i) != r.charAt(j)) break;
        }
        System.out.println(i+j+2);
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

