class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i =0;
        int j=0;
        int count =0;
        int sum=0;
        for(j=0;j<k;j++){
            sum+=arr[j];
        }
        if(sum/k>=threshold){
            count++;
        }
        
        while(j<arr.length){
             sum = sum+arr[j]-arr[i];
            if(sum/k>=threshold){
                count++;
            }
            i++;
            j++;
        }
        return count;
        
    }
}