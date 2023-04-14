class Pair{
    int color;
    int radius;
    public Pair(int color,int radius){
        this.color = color;
        this.radius = radius;
    }
}
class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        // code here
        Stack<Pair> stack = new Stack<Pair>();
        for(int i=0; i<N; i++){
            // Pair p = new Pair(color[i],radius[i]);
            if(stack.isEmpty()){
                stack.push(new Pair(color[i],radius[i]));
            }
            else{
                if(color[i]==stack.peek().color && radius[i]==stack.peek().radius){
                    stack.pop();
                }
                else{
                    stack.push(new Pair(color[i], radius[i]));
                }
            }
           
        }
        return stack.size();
    }
}


        
