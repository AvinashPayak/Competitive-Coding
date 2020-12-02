import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            if(n>=0){
                System.out.println(n);
            }
            else{
                int last = n%10;
                int slast = n/10;
                slast = slast%10;

                if(last<slast){
                    System.out.println(n/10);
                }
                else{
                    System.out.println((n/100)*10 + last);
                }
            }
        
        pp.close();
    }
}