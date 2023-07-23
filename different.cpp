#include <iostream>

int main(){
    using std::cin, std::cout, std::endl;
    long long n1, n2;
    while(cin>>n1>>n2){
        cout<<((n1 > n2)?(n1 - n2):(n2-n1))<<std::endl;
    }
    return 0;
}