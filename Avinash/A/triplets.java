import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int[] arr = new int[6];
            for(int i = 0;i<6;i++){
                arr[i] = pp.nextInt();
            }
            int alice = 0;
            int bob = 0;

            for(int i=0,j=3;i<3 && j<6;i++,j++){
                if( arr[i]!=arr[j] && arr[i]>arr[j]){
                    alice++;
                }
                else if(arr[i] != arr[j] && arr[i]<arr[j]){
                    bob++;
                }
            }
            System.out.println(alice + " " + bob);
        pp.close();
    }
}