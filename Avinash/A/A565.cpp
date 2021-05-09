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
    w(t){
        ll n;
        cin >> n;
        ll c2=0;
        ll c3=0;
        ll c5=0;
            while(n%2==0){
                n/=2;
                c2++;
            }
            while(n%3==0) {
                n/=3;
                c3++;
            }
            while(n%5==0){
                n/=5;
                c5++;
            }
            if(n != 1) cout << -1 << endl;
            else cout << c2 + 2*c3 + 3*c5 << endl;

    }
    

    return 0;
}