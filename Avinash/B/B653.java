import java.util.Scanner;

public class B653 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            long n = pp.nextLong();
            int count =0;         
            while(n!=1){
                if(n%2 !=0) {
                    n=n*2;
                    count++;
                }
                else if(n%3 ==0) {
                    n = n/6;
                    count++;
                }
                else break;
            }
            if(n == 1) System.out.println(count);
            else System.out.println(-1);
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

