#include <iostream>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    int num;
    long sum = 0;

    cin>>num;
    for (int i = 0; i < num; i++) {
        int a;
        cin>>a;
        sum += a;
    }
    cout<<sum<<endl;
    return 0;
}