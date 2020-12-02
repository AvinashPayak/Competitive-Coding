import java.util.Scanner;

 public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){

            int n = pp.nextInt();
            if(n == 0){
                System.out.println(0);
                continue;
            }
            long[] arr = new long[n-1];
            long first = pp.nextInt();
            for(int i = 0;i<n-1;i++){
                arr[i] = pp.nextInt();
            }
            long min = cost(arr,n-1);

            if(first == min){
                System.out.println(0);
            }
            else if(first>min){
                first -=min;
                if(first>(n-1)){
                    System.out.println(first%(n-1));
                }
                else if(first<(n-1)){
                    System.out.println((n-1) - first);
                }
                else{
                    System.out.println(0);
                }
            }
            else{
                min -=first;
                System.out.println(min);
            } 
        }
        pp.close();
    }
    public static long cost(long a[], int n)
{
    long middle; 
    if (n % 2 == 1) {
        middle = a[n / 2]; 
    }

    else{
        middle = (a[n / 2] + a[(n - 2) / 2]) / 2; 
    } 
    long s = 0; 
    for(int i = 0; i < n; i++) {
        s += Math.abs(a[i] - middle); 
    }  
    return s; 
}
}