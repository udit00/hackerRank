#include<iostream>
#include<vector>
int compare(std::vector<int>& a,std::vector<int>& b)
{ int alice=0, bob=0;
    for(int k=0; k<3; k++)
    {
        if(a[k]<b[k])
        bob++;
        else if(a[k]>b[k])
        alice++;     
    }
    std::cout<<alice<<" "<<bob;
    return 0;
}
int main()
{   int i=0,j=0;
    std::vector<int> a(3);
    std::vector<int> b(3);
    for(i=0; i<3; i++)
    std::cin>>a[i];
    for(j=0; j<3; j++)
    std::cin>>b[j];   
    compare(a,b);
}
