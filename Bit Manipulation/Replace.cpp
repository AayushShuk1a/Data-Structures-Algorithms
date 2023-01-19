#include<iostream>
using namespace std;

int clearBitsRange(int m,int i,int j)
{
    int a=(-1<<(j+1));
    int b=(1<<i)-1;
    int mask=a|b;
    return m&mask;
}

int replaceBits(int m,int n,int i)
{
    int mask=n<<i;
    return m|mask;
}


int main()
{
    int m,n;
    cin>>m>>n;

    int i,j;
    cin>>i>>j;

    m=clearBitsRange(m,i,j);
    cout<<m<<endl;
    cout<<replaceBits(m,n,i);
}