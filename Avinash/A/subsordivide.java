import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int count = 0;
            
            while(n!=1){
               if(isPrime(n) == true){
                n--;
                count++;
               }
               else{
                int[] f = new int[100];
                int[] exp =  new int[100];
                int len =0;
                int d =2;
                int sum=0;
                while (n>1 && d*d <= n){
                    int k=0;
                    while(n%d == 0){
                        n/=d;
                        k++;
                        count++;
                    }
                    if(k>0){
                        len++;
                        f[len] = d;
                        exp[len] = k;
                    }
                    d++;
                }
                if(n>1){
                   continue;
                }
            }
            }
            System.out.println(count);
        }
        pp.close();
}

    static boolean isPrime(int n){
        
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}