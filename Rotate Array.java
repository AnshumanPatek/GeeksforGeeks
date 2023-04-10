class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n;
        int[] output = new int[n];
        int k = 0;
        for(int i = d ; i<n;i++){
            output[k] = arr[i];
            k++;
        
        }
        //int m = n-d;
        for(int i = 0 ; i<d;i++){
            output[k]= arr[i];
            k++;
        }
        
        for(int i  = 0 ; i<n;i++){
            arr[i]=output[i];
        }
        
        
        
    }
}
