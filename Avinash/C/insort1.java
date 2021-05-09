import java.util.Scanner;

class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
            }

            insertionsort(n,arr);    

        pp.close();

    }

    static void insertionsort(int n, int[] arr){
        for(int j=n-1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    for(int k=0;k<n;k++)
                    {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                    arr[j-1] = temp;
                }
            }   
        for(int k=0;k<n;k++)
            System.out.print(arr[k]+" ");
        System.out.println();

    }
}