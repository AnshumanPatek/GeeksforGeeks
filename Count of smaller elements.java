class Compute {
    
    public long countOfElements(long arr[], long n, long x)
    {
        
         long count = 0 ;
        for(long a:arr)
        if(a<=x)
        count++;
        return count;
    }
}
