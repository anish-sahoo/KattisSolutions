#include <iostream>
#include <vector>

using namespace std;

int main(){
    int num;
    vector<int> v;

    cin>>num;
    for (int i = 0; i < num; i++) {
        int a;
        cin>>a;
        v.push_back(a);
    }
    while(!v.empty()){
        int a = v.back();
        v.pop_back();
        cout<<a<<" ";
    }
    return 0;
}