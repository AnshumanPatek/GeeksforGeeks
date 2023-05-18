class Solution {
    boolean fascinating(long n) {
        // code here
        	  String ok = n+""+(n*2)+""+(n*3);
	            char c2 []= {'1','2','3','4','5','6','7','8','9'};
	            char str []= ok.toCharArray();
	            Arrays.sort(str);
	            if(Arrays.equals(c2,str)){
	                return true;
	            }
	            
	           return false;
    }
}
