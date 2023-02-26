class Solution {
    static String toLower(String S) {
        char [] a = S.toCharArray();
        
        for(int i = 0; i < a.length; i++){
            if(a[i] <91 && a[i] > 64 ){
                a[i] = (char)((int) a[i] + 32);
            }
        }
        
        return String.valueOf(a);
        // code here
    }
}
