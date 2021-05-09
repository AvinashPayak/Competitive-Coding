/*partially solved */
import java.util.*;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            String s;

            StringBuilder builder = new StringBuilder();
            builder.append(pp.next());
            s = builder.toString();
            int[] arr = new int[n];
            int sum = 0;
            boolean flag = false;
            for(int i = 0;i<n;i++){
                arr[i] = ((int)s.charAt(i) - '0');
                if(arr[i] == 1){
                    if(i%2 == 1){
                        flag = true;
                    }
                }
                sum +=arr[i];
            }
            int ans = n/2 - sum;
            if(n%2==0){
                System.out.println(ans); 
            }
            else{
                if(flag == false || sum == 0){
                    System.out.println(ans+1);
                }
                else{
                    System.out.println(ans);
                }
            }
        }
        pp.close();
    }

}