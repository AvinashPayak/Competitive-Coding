import java.util.Scanner;

public class B556 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            char[][] arr = new char[n][n];
            for(int i = 0;i<n;i++){
                String s = pp.next();
                for(int j=0;j<n;j++) arr[i][j] = s.charAt(j);
            }
            boolean flag = true;
            for(int i=0;i<n-2;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j] == '.'){
                        if(j == 0 || j == n-1) {
                            flag = false;
                            break;
                        }
                        else if(arr[i+1][j-1] == '.' && arr[i+1][j] =='.' && arr[i+1][j+1] == '.' && arr[i+2][j] == '.'){
                            arr[i][j] = '#';
                            arr[i+1][j-1] = '#';
                            arr[i+1][j] = '#';
                            arr[i+1][j+1] = '#';
                            arr[i+2][j] = '#';
                        }
                    }
                }
                if(flag == false) break;
            }

            for(int i=n-2;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j] == '.'){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag == true) System.out.println("YES");
            else System.out.println("NO");
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

