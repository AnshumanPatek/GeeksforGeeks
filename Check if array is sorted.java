class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        int j = 1;
        for (int i = 0; i<n-1;i++){
            
              if(arr[i]>arr[j]){
                    return false;
                }
                j++;
                if(j==n){
                    break;
                }
           
        }
        
        
      
        return true;
        
    }
}
