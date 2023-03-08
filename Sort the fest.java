class Solution
{
    public String  is_common(String [] s, String [] t)
    {
        // Code here
        List<String> list = new ArrayList<>(Arrays.asList(t));
       boolean p=true;
       for(int i=0;i<5;i++){
           if(list.contains(s[i]))
             p = false;
       }
       if(p)
         return "BEHAPPY";
       else
         return "CHANGE";
   
    }
}
