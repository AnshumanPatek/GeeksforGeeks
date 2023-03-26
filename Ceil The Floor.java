


class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        
        
        
        
        
        
        int ceil=-1,floor=-1;

        for(int i=0;i<n;i++){

            if(arr[i]>x){

                if(ceil==-1) ceil=arr[i];

                else ceil=Math.min(ceil,arr[i]);

            }

            else if(arr[i]<x)floor=Math.max(floor,arr[i]);

            else{

                ceil=x;

                floor=x;

                break;

            }}

        return new Pair(floor,ceil);
        
        
        
    }
}
