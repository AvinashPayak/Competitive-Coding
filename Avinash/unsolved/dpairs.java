/* wrong answer*/
import java.util.Scanner;
class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int a = pp.nextInt();
            int b = pp.nextInt();
            int[] arra = new int[a];
            int[] arrb = new int[b];

            for(int i = 0;i<a;i++){
                arra[i] = pp.nextInt();
            }
            for(int i = 0;i<b;i++){
                arrb[i] = pp.nextInt();
            }

            for(int i=0;i<b;i++){
                System.out.println(0 + " " + i);
            }
            for(int i=1;i<a;i++){
                System.out.println((b-1)+ " "+ i);
            }
        pp.close();
    }

}