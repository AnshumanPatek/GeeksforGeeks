//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here\
        ArrayList<Long> list=new  ArrayList<Long>();
        for(int i = 0; i<n;i++){
            if(arr[i]==x){
                //list[0]=i;
                list.add((long)i);
                break;
            }
        }
        for(int i = n-1 ; 0<=i ; i--){
            if(arr[i]==x){
                list.add((long)i);
                //list[1]=i;
                return list;
            }
        }
        
        
        if(list.size() == 0){
            
            list.add(list.get(0));
            return list;
            
        }
        list.add((long)-1);
        return list;
    }
}
