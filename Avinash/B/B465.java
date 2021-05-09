import java.util.*;

public class B465 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            String s= pp.next();
            int x =0;
            int y =0;
            String pos = "";
            if(s.charAt(0) == 'U') {
                pos = "left";
                y++;
            }
            else{
                pos = "right";
                x++;
            }
            int count = 0;
            for(int i=1;i<n;i++){
                if(s.charAt(i) == 'U') {
                    y++;
                    if(pos == "right" && y>x) {
                        count++;
                        pos = "left";
                    }
                }
                else {
                    x++;
                    if(pos == "left" && x>y){
                        count++;
                        pos = "right";
                    }
                }
            }
            System.out.println(count); 
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

