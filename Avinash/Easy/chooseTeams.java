import java.util.Scanner;
public class chooseTeams {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        int k = pp.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i] = pp.nextInt();
            arr[i] +=k;
            if(arr[i]<=5) count++; 
        }
        System.out.println(count/3);
        pp.close();
    }
    
}