class Solution {

    void printTriangle(int n) {
        // code here
        int Y = n ;
        while (n >= 1){
        Y = n;
        while(Y>=1){
            System.out.print("* ");
            Y--;
        }
        System.out.println( );
        n--;
        }
    }
}
