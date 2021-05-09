#include<bits/stdc++.h>
using namespace std;

#define ff first
#define ss second
#define ll long long
#define pb push_back
#define mp make_pair
#define pii pair<int,int>
#define li list<int>
#define vi vector<int>
#define mii map<int,int>
#define mod 1000000007
#define w(x) int x; cin>>x; while(x--)
#define f(x) int x cin>>x; for(int i=0;i<x;i++)
 
void pairsort(int arr1[], int arr2[], int n){
    vector<pair<int,int>> v(n);
    for(int i=0;i<n;i++){
        v[i] = make_pair(arr1[i], arr2[i]);
    }
    sort(v.begin(), v.end());
    for(int i=0;i<n;i++){
        arr1[i] = v[i].first;
        arr2[i] = v[i].second;
    }
    return;
}

int gcd(int a, int b)
{
    if (b == 0)
        return a;
    return gcd(b, a % b);
     
}

bool isPrime(int n)
{
    if (n <= 1) return false;
    if (n <= 3) return true;
  
    if (n % 2 == 0 || n % 3 == 0) return false;
  
    for (int i = 5; i * i <= n; i = i + 6)
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
  
    return true;
}
    

int power_optimized(int a, int n){
    int ans = 1;
    while(n>0){
        int last_bit = (n&1);
        if(last_bit) ans *=a;
        a = a*a;
        n = n>>1;
    }
    return ans;
}

void filterChars(int n, char a[]){
    int i = 0;
    while(n>0){
        int lastBit = (n&1);
        if(lastBit ==1) cout<<a[i];
        i++;
        n = n>>1;
    }
    cout<< endl;
    
}

void printSubsets(char a[]){
    int n = strlen(a);
    for(int i=0; i<(1<<n);i++) filterChars(i,a);
}

int main(){
    ios::sync_with_stdio(0);
    int arr[33] = {0};
    for(int i=1;i<33;i++) arr[i] = i*i;

    int n,m;
    cin >>n>>m;

    if(min(n,m)*min(n,m) <max(n,m)) cout << 0;
    else if(m ==1 && n == 1 ) cout << 2;
    else {
        int index = 1;
        for(int i = 1;i<33;i++){
            if(arr[i]>max(n,m)) {
                index = i-1;
                break;
            }
        }
        int b = max(n,m)-arr[index];
        if(index+b*b!=min(n,m)) cout << 0;
        else cout<<1;
    } 
    return 0;
}