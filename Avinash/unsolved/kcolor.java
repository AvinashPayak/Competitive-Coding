/*Wrong answer */

import java.util.Scanner;
import java.lang.Math;
class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
            int k = pp.nextInt();
            int[] arr = new int[n];
            int[] b = new int[n];

            for(int i = 0;i<n;i++){
                arr[i] = pp.nextInt();
            }
            int[] m = new int[5002];
            int kt =0;
            for(int i=0;i<n;i++){
                if(m[arr[i]]==k)
                    {
                        System.out.println("NO");
                        System.exit(0);
                    }
                    m[arr[i]]++;
                    kt=Math.max(m[arr[i]],kt);
                    b[i]=m[arr[i]];
                    if(n-i-1==k-kt)
                    {
                        for(;i<n;i++)
                        {
                            b[i]=kt+1;
                            k++;
                        }
                    }
                }
                System.out.println("YES");
                for(int i=0;i<n;i++){
                    System.out.print(b[i] + " ");
                }

        pp.close();
    }
}
