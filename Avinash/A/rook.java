import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            int k = pp.nextInt();
            int[] row = new int[n+1];
            int[] col = new int[n+1];

            for(int i = 0;i<k;i++){
                row[(pp.nextInt())]++;
                col[(pp.nextInt())]++;
            }
            System.out.print((n-k) + " ");
            int i=1;
            int j=1;
            for(int l = 0;l<n-k;l++ ){
                while(row[i] !=0 && i!=n){
                    i++;
                }
                while(col[j] !=0 && j!=n){
                    j++;
                }
                System.out.print(i + " " + j + " ");
                i++;
                j++;
            }
            System.out.println();
        }
        pp.close();
    }

}