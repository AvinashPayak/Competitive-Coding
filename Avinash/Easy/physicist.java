import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int x =0;
            int y=0;
            int z=0;
            for(int i = 0;i<n;i++){
                x+=pp.nextInt();
                y += pp.nextInt();
                z+=pp.nextInt();
            }
            if(x ==0 && y ==0 && z == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        pp.close();
    }

}