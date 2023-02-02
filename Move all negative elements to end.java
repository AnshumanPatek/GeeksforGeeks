class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0; i<n; i++){

            if(arr[i] >= 0)

                a.add(arr[i]);

        }

        

        for(int i=0; i<n; i++){

            if(arr[i] < 0)

                a.add(arr[i]);

        }

        for(int i=0; i<n; i++){

            arr[i] = a.get(i);

        }
    }
}
