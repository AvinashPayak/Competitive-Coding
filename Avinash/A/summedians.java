import java.util.Scanner;

 public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            int k = pp.nextInt();
            int[] arr = new int[n*k];
            for(int i = 0;i<n*k;i++){
                arr[i] = pp.nextInt();
            }
            long sum = 0;
            int i =k;
            if(n == 1 ){
                i = 0;
                while(i<n*k){
                    sum += arr[i];
                    i++;
                }
                System.out.println(sum);
                continue;
            }
            else if(n == 2){
                i = 0;
                while(i<n*k){
                    sum +=arr[i];
                    i = i+n/2 +1;

                }
                System.out.println(sum);
                continue;
            }
            
            if(n%2 == 1){
                while(i<n*k){
                    sum += arr[i];
                    i = i+(n/2 + 1);
                }
            }
            else{
                while(i<n*k){
                    sum += arr[i];
                    i = i+(n/2 +1 );
                }
            }
            System.out.println(sum);
        }
        pp.close();
    }

}