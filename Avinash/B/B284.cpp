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
    int n,m;
    cin >> n>>m;
    map<string,string> m1,m2;
    for(int i=0;i<m;i++){
        string l1,l2;
        cin >> l1 >> l2;
        m1[l1] = l2;
        m2[l2] = l1;
    }

    for(int i=0;i<n;i++){
        string s;
        cin >> s;
        if(m1.find(s) != m1.end()){
            if(s.size()<=m1[s].size()) cout << s << " ";
            else cout << m1[s] << " ";
        }
        else {
            if(s.size()>= m2[s].size()) cout << m2[s] << " ";
            else cout << s << " ";
        }
    }
    return 0;
}