#include<bits/stdc++.h>
using namespace std;

long long friends(long long arr[], int players,int diff){
    int count = 0;
    for(int i=0;i<players;i++){
        int x = arr[players] & arr[i]; 
        int y = arr[players] | arr[i];
        bitset<32> b1(x); 
        bitset<32> b2(y);
        int r1 = b1.count();
        int r2 = b2.count();
        if(abs(r1-r2)<=diff) count++;
    }
    return count;
} 

int main(){
    int soldiers,players,diff;
    cin >> soldiers >> players >> diff;
    long long types[players+1];
    for(int i=0;i<=players;i++) cin >> types[i];
    cout << friends(types,players,diff);
    return 0;
}