import java.util.Scanner;

public class BallBerland {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int boys = pp.nextInt();
            int girls = pp.nextInt();
            int k = pp.nextInt();
            int boy[] = new int[k];
            int girl[] = new int[k];
            for(int i =0;i<k;i++) boy[i] = pp.nextInt();
            for(int i=0;i<k;i++) girl[i] = pp.nextInt();

            int count = 0;
            System.out.println(binomialCoeff(k, 2));


        }
        pp.close();
    }
    static int binomialCoeff(int n, int k) 
    { 
        int res = 1; 
  
        if (k > n - k) 
            k = n - k; 
  

        for (int i = 0; i < k; ++i) { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
  
        return res; 
    }
}