class Solution {
    static long nthFibonacci(long n){
        // code here
         long a = 0, b = 1, c, i;
        //long a = 0, long b = 1,long c=0;
        long mod=1000000007;
        if (n == 0)
            return a;
        for (i = 2; i <= n; i++)
        {
            c = (a + b)%mod;
            a = b;
            b = c;
        }
        return b;
      
    }
}
