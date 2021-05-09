import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
        
            int count = 0;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++)
                if((n+1)*(j+1)*i == (i+1)*j*n){
                    count++;
                }
            }
            System.out.println(count);
            
        pp.close();
    }

}