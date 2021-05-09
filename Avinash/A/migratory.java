import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int[] arr = new int[6];
            for(int i = 0;i<n;i++){
                arr[pp.nextInt()]++;
            }
            int max=0;
            for(int i=1;i<6;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            int count =1;
            int i=1;
            while(arr[i] != max){
                count++;
                i++;
            }
            System.out.println(count);
        pp.close();
    }
}