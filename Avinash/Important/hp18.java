import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            int a = pp.nextInt();
            int b = pp.nextInt();
            int counta =0;
            int countb=0;
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
                if(arr[i]%b ==0 && arr[i]%a !=0){
                    countb++;
                }
                else if(arr[i]%a == 0){
                    counta++;
                }
            }
            if(counta>countb){
                System.out.println("BOB");
            }
            else{
                System.out.println("ALICE");
            }
        }
        pp.close();
    }
}