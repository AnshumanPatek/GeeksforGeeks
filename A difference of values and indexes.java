
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int maxDistance (int arr[], int n) {
        //Complete the function
        
        
         int a1 = Integer.MAX_VALUE;
        int a2 = Integer.MIN_VALUE;
        int a3 = Integer.MIN_VALUE;
        int a4 = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            a1 = Math.min(a1,(arr[i]+i));
            a2 = Math.max(a2,(arr[i]+i));
            a3 = Math.max(a3,(arr[i]-i));
            a4 = Math.min(a4,(arr[i]-i));
        }
        return Math.max(a3-a4, a2-a1);
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
