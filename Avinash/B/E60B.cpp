#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,m,k;
    cin >> n >> m >> k;
    long long arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    sort(arr, arr + n);
    long long ans = (m/(k+1))*(arr[n-1]*k + arr[n-2]) + m%(k+1)*(arr[n-1]);
        cout << ans;
    return 0;
}