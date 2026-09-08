class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            boolean duplicate =false;
            for(int k=i;k<j;k++){
            if(s.charAt(k)==s.charAt(j)){
                duplicate=true;
                break;
            }
            }
            if(!duplicate){
                int curr =j-i+1;
                max= Math.max(curr,max);
                j++;
            } else{
                i++;
            }
        }
        return max;
        
    }
}