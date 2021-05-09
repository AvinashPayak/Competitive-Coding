#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,k;
    cin >> n>>k;
    int arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    for(int i=0;i<n;i++) arr[i] = (i+1)%k;
    if(n%k==0)
    return 0;
}