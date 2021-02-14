import java.util.Scanner;

class foodProc {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        long h = pp.nextLong();
        long k = pp.nextLong();
        long[] arr = new long[n];
        for(int i = 0;i<n;i++){
            arr[i] = pp.nextLong();
        }
        System.out.println(food(arr,h,k));
        pp.close();
    }

    static long food(long arr[], long h, long k){
        long time =0;
        long rem= 0;
        for(int i=0;i<arr.length;i++){
            if(rem+arr[i]<=h) rem+=arr[i];
            else {
                time++;
                rem = arr[i];
            }
            time+=rem/k;
            rem =rem%k;
        }
        time+=rem/k;
        rem  =rem%k;
        time += rem>0?1:0;
        return time;
    }
}

