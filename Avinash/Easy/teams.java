import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int max = 0;
            for(int i = 0;i<n;i++){
                int petya = pp.nextInt();
                int vasya = pp.nextInt();
                int tony = pp.nextInt();
                if((petya + vasya + tony)>=2){
                    max++;
                }
            }
            System.out.println(max);
        pp.close();
    }

}