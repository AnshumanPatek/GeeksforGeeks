class Compute {
    
    public void rotate(int arr[], int n)
    {
     
            int first=0;
        int last=n-1;
        for(int i=0;i<n-1;i++)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
        }
     
     
     
    }
}
