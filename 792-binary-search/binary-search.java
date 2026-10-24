class Solution {
        public int binary(int []nums ,int target, int start ,int end){
            int mid = start+(end-start)/2;
            if(start<=end){
                if(target==nums[mid]){
                    return mid;
                }
                if(target<nums[mid]){
                    return binary(nums,target,start,mid-1);
                }
                if(target>nums[mid]){
                    return binary(nums,target,mid+1,end);
                }
            }
            return -1;
        }
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        return binary(nums,target,start,end);

    }
}