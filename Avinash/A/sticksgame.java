import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int m = pp.nextInt();
            int min = Math.min(n, m);
            if(min%2 == 0){
                System.out.println("Malvika");
            }
            else{
                System.out.println("Akshat");
            }      
        pp.close();
    }
}