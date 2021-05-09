import java.util.Scanner;

public class GB7 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int max = pp.nextInt();
            System.out.print(max + " ");
            for(int i = 1;i<n;i++){
                int x = pp.nextInt();
                x += max;
                System.out.print(x + " ");
                max = Math.max(max,x);
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

