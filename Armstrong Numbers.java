class Solution {
    static String armstrongNumber(int n){
        // code here
        int num = n;
        int sum =0;
        int last =num%10;
         num = num/10;
        int mid = num %10;
        num = num/10;
        sum = (last*last*last)+(mid*mid*mid)+(num*num*num);
        if (sum==n){
             return "Yes";
        }else {
            return "No";
        
            
        }
