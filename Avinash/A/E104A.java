import java.util.Scanner;

public class E104A {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int t = pp.nextInt();
        for(int T=0;T<t;T++){
            int n = pp.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
			int count = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = pp.nextInt();
				if(arr[i]<min) {
					min = arr[i];
					count = 1;
				} else if(arr[i]==min){
					count++;
				}
			}
			int sum = n-count;
			if(sum>0) {
				System.out.println(sum);
			} else {
				System.out.println("0");
			}
        }
        
        pp.close();
    }
}

