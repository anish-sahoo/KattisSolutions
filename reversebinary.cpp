#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    long num;
    cin >> num;
    long bin_rev{0}, rev_int{0}, count{0};

    while (num > 0) {
        bin_rev = bin_rev * 10 + num % 2;
        num /= 2;
    }

    while (bin_rev > 0) {
        rev_int += (bin_rev % 10) * pow(2, count);
        bin_rev /= 10;
        count++;
    }

    cout << rev_int << endl;
    return 0;
}

//fails 4th testcase - FIX LATER