import java.util.Scanner;

class B379 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int two = pp.nextInt();
            int three = pp.nextInt();
            int five = pp.nextInt();
            int six = pp.nextInt();
            int min = Math.min(two,Math.min(five,six));
            int total = 256*min;
            two-=min;
            five-=min;
            six-=min;
            min = Math.min(three,two);
            total+= 32*min;
            System.out.println(total);
        
        
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

