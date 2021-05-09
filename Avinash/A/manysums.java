import java.util.*;
class manysums {
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        int n = pp.nextInt();
        
        for(int i=0;i<n;i++){
             int l = pp.nextInt();
             int r = pp.nextInt();
             System.out.println(2*(r-l+1)-1);
        }
        pp.close();
    }
}