class Solution {
    long sumOfSeries(long N) {
        // code here
         if(n==1)return 1;
        return n*n*n + sumOfSeries(n-1);
    }
}
