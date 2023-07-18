#include <iostream>
#include <map>

using namespace std;

int main() {
    int n, q;
    cin >> n >> q;
    map<int, int> m;

    int init = 0;
    string query;

    for (int i = 0; i < q; i++) {
        cin >> query;
        if (query == "SET") {
            int q1, q2;
            cin >> q1 >> q2;
            m[q1] = q2;
        }
        else if (query == "PRINT") {
            int q1;
            cin >> q1;
            if (m.find(q1) != m.end()) {
                cout << m.at(q1) << endl;
            } 
            else cout << init << endl;
        } 
        else {
            int q1;
            cin >> q1;
            init = q1;
            m.clear();
        }
    }
    return 0;
}
