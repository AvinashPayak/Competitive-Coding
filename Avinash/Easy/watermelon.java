import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        if(n%2==0 && n!=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        pp.close();
    }

}