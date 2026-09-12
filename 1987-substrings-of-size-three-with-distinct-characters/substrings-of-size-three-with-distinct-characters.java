class Solution {
    public int countGoodSubstrings(String s) {
        int i=0;
        int j=2;
        int count =0;
        
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(i+1) &&
               s.charAt(i+1)!=s.charAt(j) &&
               s.charAt(i)!=s.charAt(j)  ){
                count++;
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
        return count;
    }
}