import java.util.Scanner;
public class B50 {
    public static void main(String[] args){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = pp.nextInt();
            sum+=arr[i];
        }
        int m = pp.nextInt();
        for(int i=0;i<m;i++){
            int p = pp.nextInt();
            int x = pp.nextInt();
            System.out.println(sum-arr[p-1]+x);
        }
        pp.close();
    } 
}
