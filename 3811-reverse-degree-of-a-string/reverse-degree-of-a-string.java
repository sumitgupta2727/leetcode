class Solution {
    public int reverseDegree(String s) {
        
        int sum=0;
        
        for(int i=0;i<s.length();i++){
            int multi = 'z'- s.charAt(i)+1;
            sum += multi*(i+1);

        }
        return sum;

        
    }
}