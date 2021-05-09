import java.util.Scanner;

public class differentdivisors {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            long num1 = n;
            while(!isPrime(num1) || num1-1<n){
                num1++;
            }
            long num2 = num1+n;
            while(!isPrime(num2) || num2-num1<n){
                num2++;
            }
            System.out.println(num1*num2);
        }
        pp.close();
    }

    public static boolean isPrime(long n) { 
        for (long i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    } 

    
}