#include<iostream>
using namespace std;


int MaxConsecutiveOnes(int n)
{
    int count=0;
    while(n>0)
    {
        n=n&(n<<1);  //it will left shift and remove one in every iterations
        count++;
    }

    return count;

}

int main()
{
    int n;
    cin>>n;
    cout<<MaxConsecutiveOnes(n);
}