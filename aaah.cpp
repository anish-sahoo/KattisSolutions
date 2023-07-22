#include <iostream>

int main(){
    std::string a,b;
    std::cin>>a;
    std::cin>>b;
    std::cout<<(a.length() >= b.length()?"go":"no")<<std::endl;
}