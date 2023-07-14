#include <iostream>

using namespace std;

int main(){
    int num;
    long sum;

    cin>>num;
    for (int i = 0; i < num; i++) {
        int a;
        cin>>a;
        sum += a;
    }
    cout<<sum;
    return 0;
}

//For some reason Kattis doesn't accept this answer. Testing gives correct answers on my side.