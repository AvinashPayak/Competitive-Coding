import java.util.Scanner;
public class bookshelf {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            int sum,f1,l1;
            sum = f1 = l1 = 0;
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
                sum += arr[i];
            }
            for(int i=0;i<n;i++){
                if(arr[i] == 1){
                    f1 = i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--){
                if(arr[i] == 1){
                    l1 = i;
                    break;
                }
            }
                System.out.println((l1-f1+1) - sum); 
        }
        pp.close();
    }
}