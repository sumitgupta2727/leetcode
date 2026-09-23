class Solution {
    public int minOperations(int[] nums, int x) {

        int n = nums.length;
        int total = 0;

        for(int i = 0; i < n; i++){
            total += nums[i];
        }

        int target = total - x;

        if(target < 0){
            return -1;
        }

        int left = 0;
        int sum = 0;
        int max = -1;

        for(int right = 0; right < n; right++){

            sum += nums[right];

            while(sum > target && left <= right){
                sum -= nums[left];
                left++;
            }

            if(sum == target){
                max = Math.max(max, right - left + 1);
            }
        }

        if(max == -1){
            return -1;
        }

        return n - max;
    }
}