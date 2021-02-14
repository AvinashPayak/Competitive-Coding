#include<bits/stdc++.h>
using namespace std;

void teams(int arr[], int n){
    int c1= 0,c2=0,c3=0;
    for(int i=0;i<n;i++){
        if(arr[i] == 1) c1++;
        if(arr[i] == 2) c2++;
        if(arr[i] == 3) c3++;
    }
    int teams = min(c1,min(c2,c3));
    cout << teams << endl;
    int t1[c1],t2[c2],t3[c3];
    int index = 0;
    for(int i=0;i<n;i++) if(arr[i] == 1) t1[index++] = i+1;
    index = 0;
    for(int i=0;i<n;i++) if(arr[i] == 2) t2[index++] = i+1;
    index = 0;
    for(int i=0;i<n;i++) if(arr[i] == 3) t3[index++] = i+1;
        
    for(int i=0;i<teams;i++){
        cout << t1[i] << " ";
        cout << t2[i] << " ";
        cout << t3[i] << " ";
        cout << endl;
    }
}

int main(){
    int n;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    teams(arr,n);
    return 0;
}