#include<bits/stdc++.h>
using namespace std;
void swap(long *i, long *j){
    long temp = *i;
    *i = *j;
    *j = temp;
}
void segment(long arr[], int n){
    bool flag = false;
    int start = 1;
    int end = 1;
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            if(flag == true){
                cout << "no";
                return;
            }
            int start = i+1;
            i++;
            while(arr[i+1]<arr[i]) {
                i=i+1;
            }
            swap(&arr[i],&arr[i+1]);
            end = i+1;
            flag = true;
            i--;
        }

    }

    cout<< start << " "<< end;
}
int main(){
    int n;
    cin >> n;
    long arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    segment(arr,n);
    return 0;
}