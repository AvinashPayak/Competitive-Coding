import java.util.Scanner;

class B663 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int m = pp.nextInt();

            char[][] arr = new char[n][m];
            for(int i = 0;i<n;i++){
                String s = pp.next();
                for(int j =0;j<m;j++){
                    arr[i][j] = s.charAt(j);
                }
            }
            int count =0;
            for(int i = 0;i<n;i++){
                if(arr[i][m-1] == 'R') count++;
            }
            for(int j = 0;j<m;j++){
                if(arr[n-1][j] == 'D') count++;
            }

            System.out.println(count);
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

