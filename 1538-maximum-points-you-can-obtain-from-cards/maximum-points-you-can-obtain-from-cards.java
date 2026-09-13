class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i=0;
        int j=cardPoints.length-1;
        int maxsum=0;
        int sum=0;
        for(i=0;i<k;i++){
             sum +=cardPoints[i];
        }
        maxsum = Math.max(sum,maxsum);
        i=k-1;
        while(i>=0){
            sum = sum + cardPoints[j]-cardPoints[i];
            
            maxsum= Math.max(sum,maxsum);
            i--;
            j--;
        }
        return maxsum;

        
    }
}