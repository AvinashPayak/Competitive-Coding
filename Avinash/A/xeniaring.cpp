#include<bits/stdc++.h>
using namespace std;

long long time(int arr[], int houses, int tasks){
    long long time = arr[0]-1;
    for(int i=0;i<tasks-1;i++){
        if(arr[i] <= arr[i+1]) {
            time =time + (arr[i+1] - arr[i]);
        }
        else if(arr[i] > arr[i+1]) {
            time =time + (houses+arr[i+1] - arr[i]);
        }
    }
    return time;
}

int main(){
    int n,m;
    cin >> n >> m;
    int arr[m];
    for(int i=0;i<m;i++) cin >> arr[i];
    cout << time(arr,n,m);
    return 0;
}