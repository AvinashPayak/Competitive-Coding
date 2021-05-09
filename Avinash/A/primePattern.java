import java.util.Scanner;

class primePattern {
static int sieve[] = new int[100001];
    public static void  getSieve(){
        int n = 100001;
        for(int i = 2; i*i<n;i++){
            if(sieve[i] == 0){
                for(int j = i;j*i<n;j++){
                    sieve[j*i] = 1;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner pp = new Scanner(System.in);
        getSieve();
        int count=0;
        int n = pp.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = pp.nextInt();
        }
        for(int i=0;i<n;i++){
            if(sieve[arr[i]] == 0) continue;
            if(arr[i] == 100000) count+=3;
            else {
                int next = arr[i]+1;
                int prev = arr[i]-1;
                while(next< 100000 && sieve[next] !=0) next++;
                if(next == 100000) next +=3;
                while(prev >1 && sieve[prev] !=0 ) prev--;
                if((next-arr[i])<(arr[i]-prev)) count+=(next-arr[i]);
                else count+=(arr[i]-prev);
            }
        }
        System.out.println(count);
        pp.close();
    }
}

