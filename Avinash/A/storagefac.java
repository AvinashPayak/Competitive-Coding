import java.util.*;

class newspaper {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int m = pp.nextInt();
        int[] frontIndex = new int[n];
        int[] backIndex = new int[n];
        for(int i=0;i<n;i++) frontIndex[i] = 0;
        for(int i=0;i<n;i++) backIndex[i] = n-1;
        int[][] shelves = new int[n][];
        for(int i =0;i<n;i++){
            int size = pp.nextInt();
            shelves[n] = new int[size];
            backIndex[i] = size-1;
            for(int j=0;j<size;j++) shelves[n][j] = pp.nextInt();
        }

        for(int i=0;i<n;i++){
            int max = Integer.MIN_VALUE;
            int index = 0;
            if(shelves[i][frontIndex[i]] > shelves[i][backIndex[i]]) {
                max = 
            }

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