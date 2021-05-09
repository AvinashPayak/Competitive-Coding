import java.util.Scanner;

public class BT16 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int l1 = pp.nextInt();
            int b1 = pp.nextInt();
            int l2 = pp.nextInt();
            int b2 = pp.nextInt();

            if(l1 == l2 && (b1+b2) == l1) System.out.println("Yes");
            else if(b1 == b2 && (l1+l2) == b1) System.out.println("Yes");
            else if(l1 == b2 && (l2+b1) == l1) System.out.println("Yes");
            else if(l2 == b1 && (l1+b2) == l2) System.out.println("Yes");
            else System.out.println("No"); 
            
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

