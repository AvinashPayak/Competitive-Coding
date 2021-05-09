import java.util.*;

public class B560 {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        long[] arr = new long[n];
        long count  = 1;
        for(int i = 0;i<n;i++){
            arr[i] = pp.nextLong();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]>=count) count++; 
        }
        System.out.println(count-1);
        pp.close();
    }

}

