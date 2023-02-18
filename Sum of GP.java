
class Solution
{
    public long sum_of_gp(long n, long a, long r)
    {
        // Code here
         long rn = (long)Math.pow(r,n);
        if (r==1){
            return n*a;
        }
        long ans =  a*(rn-1)/(r-1);
        return ans;
    
    }
}
