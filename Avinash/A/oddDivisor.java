import java.util.Scanner;
public class oddDivisor {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            long n = pp.nextLong();
            if(isPowerOfTwo(n) == true) System.out.println("NO");
            else System.out.println("YES");
        }
        pp.close();
    }
    static boolean isPowerOfTwo(long n){
        if(n==0)
        return false;
        while (n != 1) { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true;
    }
}