#include <iostream>
#include <vector>
#include <algorithm>
#include <iomanip>

using namespace std;

int main() {
    int c;
    cin>>c;
    while(c-- > 0){
        int n;
        double sum = 0.0;
        cin>>n;
        vector<int> vec;
        
        for (auto i=0; i<n; i++) {
            int item;
            cin>>item;
            vec.push_back(item);
            sum += item;
        }
        sort(vec.begin(), vec.end());

        double average = sum*1.0/n;
        
        int aboveAverageCount = 0;
        for (int i = 0; i < n; i++) {
            if (vec[i] > average) {
                aboveAverageCount++;
            }
        }
        
        double percentage =  aboveAverageCount * 100.00 / n;
        cout << fixed << setprecision(3) << percentage << "%" << endl;
    }
    return 0;
}
