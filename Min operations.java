class Solution {
    public static int solve(int a, int b) {
        // code here
        if(a==b) return 0 ;

       

        int nd = a&b ;

        if(  nd == a || nd == b ) return 1 ;

        

        return 2 ;
    }
}
