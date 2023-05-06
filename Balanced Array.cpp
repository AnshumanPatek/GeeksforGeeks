//{ Driver Code Starts
#include <bits/stdc++.h>
#include<stdio.h>
#include<math.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:
    int minValueToBalance(int a[], int n)
    {
       //code here.
         int sum = 0;
         int max = 2147483647;
       for(int i = 0; i<n/2;i++){
           sum = sum + a[i];
       }
       int chigg =0;
       for(int i = n/2; i<n;i++){
           chigg = chigg + a[i];
       }
      if(sum == chigg){
          return 0;
      }
       int count = 0;
       if(sum > chigg ){
        for(int i = 0; i<max;i++){
           if(sum == chigg){
               return count;
           }
           count++;
           chigg++;
       }
           
       }
       else{
           for(int i = 0; i<max;i++){
           if(sum == chigg){
               return count;
           }
           count++;
           sum++;
       }
       
       }
    }
};
