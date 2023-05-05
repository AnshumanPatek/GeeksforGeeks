class Solution{   
public:
    int countZeroes(int arr[], int n) {
        // code here

    // code here
      //int check =0;
      int count = 0;
         for(int i=0;i<n;i++){
             if(arr[i]==0){
                 count++;
             }
             
             
         }
         return count;

    }
};
