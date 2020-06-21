#include<bits/stdc++.h>
const int MAX=100;
int main()
{ int arr[MAX][MAX];
  std::vector<int> diag;
  std::vector<int> opp_diag;
  int Num;
  std::cin>>Num;
  for(int i=0; i<Num; i++)
  { for(int j=0; j<Num; j++)
      {  
        std::cin>>arr[i][j];
    }
  } 
  for(int i=0; i<Num; i++)
  { for(int j=0; j<Num; j++)
      {  
        if(i==j)
          diag.push_back(arr[i][j]);
        if((i + j) == (Num - 1))      
        opp_diag.push_back(arr[i][j]);
    }
  }   
   int sum=0;
   int sum_opp=0;
   for(int i=0; i<diag.size(); i++)
  {  sum+=diag[i];
     sum_opp+=opp_diag[i];
  }
  int ab = abs(sum-sum_opp);
  std::cout<<ab;
}
