import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            int distance = 0;
            
            for(int i=0;i<n;i++){
                arr[i] = pp.nextInt();
            }
            int gas = arr[0];
            for(int i=1;i<n;i++){
                if(gas == 0) break;
                else{
                    gas = gas -1 + arr[i];
                    distance++;
                }
            }
            System.out.println(gas+distance);
        }
        pp.close();
    }
}