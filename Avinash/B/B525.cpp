#include<bits/stdc++.h>
using namespace std;

int main(){
    long long n,k;
    cin >> n >> k;
    set<int> s;
    s.insert(0);
    while(n--) {
        int a;
        cin >> a;
        s.insert(a);
    }

    auto it = s.begin();

    for(int i =0;i<k;i++){
        if(next(it) == s.end()) cout<< "0\n";
        else {
            cout << *next(it) - *it << endl;
            it = next(it);
        }
    }
    return 0;
}