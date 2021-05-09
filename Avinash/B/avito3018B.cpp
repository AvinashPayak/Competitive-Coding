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
    ios::sync_with_stdio(0);
    //sort(v.begin(),v.end(),[](int a, int b){return a>b;});
    unordered_map<ll,ll> um1;
    unordered_map<ll,ll> um2;
    ll n,m;
    cin >> n;
    for(int i=0;i<n;i++){
        ll key,value;
        cin >> key >> value;
        um1[key] = value;
    }

    cin >> m;
    for(int i=0;i<m;i++){
        ll key,value;
        cin >> key >> value;
        um2[key] = value;
    }

    ll sum = 0;
    for(auto it=um1.begin();it!=um1.end();it++){
        if(it!=um2.end()) {
            if(um1[it->first] > um2[it->first]) {
                sum+=um1[it->first];
                um2.erase(it->first);
                }
            else {
                sum+=um2[it->first];
                um2.erase(it->first);
            }
        }
        else sum+=um1[it->first];
    }
    for(auto it:um2) sum+=it.second;
    
    cout << sum << endl;
    return 0;
}