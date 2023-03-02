class Solution{
    int findFrequency(int A[], int x){
        int count =0;
        Arrays.sort(A);
        for (int i = 0; i<A.length;i++){
            if(x==A[i]){
                count++;
            }
        }
        return count;
    }
}
