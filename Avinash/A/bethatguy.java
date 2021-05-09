import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int level = pp.nextInt();
            int p = pp.nextInt();
            int[] lookup = new int[level+1];
            int[] parr = new int[p];
            for(int i = 0;i<p;i++){
                parr[i] = pp.nextInt();
                lookup[parr[i]]++;
            }
            int q = pp.nextInt();
            int[] qarr = new int[q];
            for(int i = 0;i<q;i++){
                qarr[i] = pp.nextInt();
                lookup[qarr[i]]++;
            }

            for(int i=1;i<level+1;i++){
                if(lookup[i]==0){
                    System.out.println("Oh, my keyboard!");
                    System.exit(0);
                }
            }
            System.out.println("I become the guy.");



        
        pp.close();
    }

}