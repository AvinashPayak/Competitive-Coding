import java.util.Scanner;

class B661 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] candy = new int[n];
            int[] orange = new int[n];
            int minOrange = Integer.MAX_VALUE;
            int minCandy = Integer.MAX_VALUE;
            for(int i = 0;i<n;i++) {
                candy[i] = pp.nextInt();
                if(candy[i]<minCandy) minCandy = candy[i];
            }
            for(int i=0;i<n;i++) {
                orange[i] = pp.nextInt();
                if(orange[i]<minOrange) minOrange = orange[i];
        }
        long moves = 0;
        for(int i=0;i<n;i++){
            //int min = Math.min((orange[i]-minOrange),(candy[i] - minCandy));
            int max = Math.max((orange[i]-minOrange),(candy[i] - minCandy));
            moves+=max;
        }
        System.out.println(moves);
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

