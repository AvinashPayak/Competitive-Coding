import java.util.Scanner;

class plusminus {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T = 0;T<t;T++){
            int n = pp.nextInt();
            StringBuilder builder = new StringBuilder();
            builder.append(pp.nextLine());
            String s = pp.next();
            int arr[] = new int[n];
            arr[0] = 0;
            for(int i=1;i<n;i++){
                if(s.charAt(i-1) == '+') arr[i] = Math.max(arr[i-1]+1,1);
                else arr[i] = arr[i-1]-1;
            }
            if(s.charAt(n-1) == '+') arr[n-1]++;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>max) max = arr[i];
            }
            if(0>max) System.out.println(0);
            else System.out.println(max);
        }
        pp.close();
    }
}

