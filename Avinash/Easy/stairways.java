import java.util.Scanner;

public -=class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int[] arr = new int[n];
            int stairways = 0;
            int previous =0;
            int current = 0;
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
                if(arr[i] == 1){
                    stairways++;
                }
            }
            System.out.println(stairways);
            for(int i=0,j=0;i<n && j<stairways;i++){
                if(arr[i] == 1 && i !=0){
                    current = i;
                    System.out.print((current- previous) + " ");
                    j++;
                    previous = current;
                }
            }
            System.out.print((n-current));
        pp.close();
    }

}