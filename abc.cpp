#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    int a,b,c;
    cin>>a>>b>>c;

    vector<int> vec;
    vec.push_back(a);
    vec.push_back(b);
    vec.push_back(c);
    sort(vec.begin(), vec.end());

    string letters;
    cin>>letters;
    for(int i=0; i<3; i++){
        cout<<vec.at(letters[i]-'A')<<" ";
    }

    return 0;
}