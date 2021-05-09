import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            long n = pp.nextLong();
            long count = pp.nextLong();
            long ans = 0;
            if(n%2 == 0 && count<=n/2){
                ans = 2*count -1;
            }
            else if(n%2 == 1 && count<=(n/2+1)){
                ans = 2*(count-1) + 1;
            }
            else if(n%2 ==0 && count>=(n/2)){
                count = count - n/2;
                ans = 2*count;   
            }
            else if(n%2 == 1 && count>=(n/2)+1){
                count = count - (n-1)/2 - 1;
                ans = 2*(count);
            }
            System.out.println(ans);
            
        pp.close();
    }

}