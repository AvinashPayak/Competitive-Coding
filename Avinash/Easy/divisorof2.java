import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
            int n = pp.nextInt();
            int[] arr = new int[10001];
            int max = 0;
            int num1 = -1;
            int num2=0;
            for(int i = 0;i<n;i++){
                int num = pp.nextInt();
                if(num>=max){
                    max = num;
                }
                arr[num]++;
            }
            int i=max;
            int j=max;
            //System.out.println(max);
            int count = 0;
            while(i>=1 && j>=1){
                if(arr[max] == 2){
                    System.out.println(max + " " + max);
                    System.exit(0);
                }
                while(arr[i] !=2){
                    i--;
                }
                while(j > i){
                    if((arr[j] ==1  && j%i == 0 && count <2)){
                        if(count == 0){
                            count++;
                            System.out.print(j + " ");
                            num1 = j;
                        }
                        else if(num1%j !=0){
                            count++;
                            num2 = j;
                            System.out.print(num2);
                        }
                    }
                    if(count == 2){
                        break;
                    }
                    j--;
                }
                if(count == 2){
                    break;
                }
                i--;
                j--;
            }
            
            if(count ==1 ) {
                System.out.print(1);
            }

        pp.close();
    }

}