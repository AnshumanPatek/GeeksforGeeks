class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        long sum = 0;
        
        Arrays.sort(arr);
        for (int i = 0; i<n;i++){
            sum = (sum +(long)arr[i]*i)%1000000007;
        }
        return (int)sum;
        
    }   
}
