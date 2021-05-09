import java.util.Scanner;

class B126{
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int sum = 0;
            for(int i = 0;i<n;i++) sum+= pp.nextInt();
            
            System.out.println(String.format("%.12f", (double)sum/n));
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

