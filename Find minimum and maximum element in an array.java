class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
       
        pair value =new pair(a[0],a[a.length-1]);
       return value;
        
    }
}
