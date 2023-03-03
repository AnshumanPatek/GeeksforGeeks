
class Solution {
    String firstAlphabet(String S) {
        // code here
        String str="";
       str=str+S.charAt(0);
       for(int i=0;i<S.length();i++){
           if(S.charAt(i)==' '){
               str+=S.charAt(i+1);
           }
       }
       return str;
    }
};
