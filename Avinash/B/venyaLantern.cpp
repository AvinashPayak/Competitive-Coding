#include<bits/stdc++.h>
using namespace std;

int main(){
    cout <<fixed;
    cout << setprecision(10);
    int n;
    long long l;
    cin >> n>>l;
    long long arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    double long maxNum = 0;
    sort(arr,arr+ n);
    long double start= 0,end=0;
    if(arr[0] != 0) start = arr[0];
    if(arr[n-1] != l) end = l-arr[n-1];
    for(int i=0;i<n-1;i++) if(arr[i+1]-arr[i]>maxNum) maxNum = abs(arr[i]-arr[i+1]);
    maxNum/=2;
    maxNum = max(start,max(maxNum,end));
    cout << maxNum;
    return 0;
}