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
        int n;
        cin >> n;
        int uni[n];
        int skill[n];
        ll sum = 0;
        for(int i=0;i<n;i++) cin >> uni[i];
        for(int i =0 ;i<n;i++) {
            cin >> skill[i];
            sum+=skill[i];
        }

        pairsort(skill,uni,n);
        for(int i =0 ;i<n;i++) cout << uni[i] << " " << skill[i] << endl;
        cout << sum << " ";
        for(int i = 2;i<=n;i++){
            for(int j=1;j<=200*1000+1;j++){
                if(count(uni,uni+n,j) > 0){
                 int temp =  count(uni,uni+n,j)%i;
                 if(temp == 0) continue;
                 for(int k=0;k<n;k++){
                     if(temp ==0) break;
                     if(uni[k]==j) {
                         sum-=skill[k];
                    }
                    temp--;

                }
            }
        }
        cout << sum << " ";
        }
        cout << endl;
    }

    return 0;
}