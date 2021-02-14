import java.util.*;

class rocperm {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }
       
        
        pp.close();
    }
}

