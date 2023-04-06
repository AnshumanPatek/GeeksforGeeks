class Solution{
    int equalSum(int [] A, int n) {
        //Write your code here
        if(n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
            A[i]+=A[i-1];
        }
        for(int i=1;i<n-1;i++){
            if(A[i-1]==A[n-1]-A[i]){
                return i+1;
            }
        }
//         int leftSum[]=new int[n];
//         leftSum[0]=A[0];
//         int rightSum[]=new int[n];
//         rightSum[n-1]=A[n-1];
//         for(int i=1;i<n;i++){
//             leftSum[i]=A[i]+leftSum[i-1];
//         }
//         for(int i=n-2;i>=0;i--){
//             rightSum[i]=A[i]+rightSum[i+1];
//         }

//         for(int i=1;i<n-1;i++){
//             if(leftSum[i-1]==rightSum[i+1]){
//                 return i+1;
//             }
//         }
        return -1;
    }
}
