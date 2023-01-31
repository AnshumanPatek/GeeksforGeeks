class Solution{
    public:
    int product(int arr[], int n)
    {
        int sum = 1;
        for (int i = 0;i<n; i++){
            sum = sum *arr[i];
            
        }
        return sum;
    }
};
