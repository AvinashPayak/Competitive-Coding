import java.util.Scanner;

public class B635 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int x = pp.nextInt();
            int n = pp.nextInt();
            int m = pp.nextInt();
            while(n!=0 && x>20 ) {
                x = x/2 + 10;
                n--;    
            }
            for(int i=0;i<m;i++) x-=10;

            if(x>0) System.out.println("NO");
            else System.out.println("YES");
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

