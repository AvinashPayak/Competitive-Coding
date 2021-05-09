import java.util.*;

public class B693 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int c2 = 0;
            int c1 = 0;
            int sum = 0;
            for(int i=0;i<n;i++){
                int c = pp.nextInt();
                if(c == 1) c1++;
                else c2++;
            }
            if(c2%2 ==1 && c1>0 && c1%2 == 0) System.out.println("YES");
            else if(c1%2 == 0 && c2%2 == 0) System.out.println("YES");
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