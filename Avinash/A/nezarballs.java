import java.util.Scanner;

class nezarballs {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            int max = 1,count=1;
            arr[0] = pp.nextInt();
            for(int i = 1;i<n;i++){
                arr[i] = pp.nextInt();
                if(arr[i-1] != arr[i]){
                    if(count>max) max = count;
                    count =1;
                    continue;
                }
                count++;
            }
            if(count>max) max = count;
            System.out.println(max);
        }
        pp.close();
    }
}

