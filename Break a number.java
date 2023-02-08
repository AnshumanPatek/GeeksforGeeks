class Solution{
    int waysToBreakNumber(int N){
        // code here
          long mod = 1000000007;

        long n = N;

        return (int)((((n+1)*(n+2)/2))%mod);
    }
}
