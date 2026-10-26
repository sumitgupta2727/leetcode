import java.util.*;
class Solution {
    public void all(int [] nums,List<List<Integer>> result , int idx){
        if(idx==nums.length){
           List<Integer> ans = new ArrayList<>();

            for (int val : nums) {
                ans.add(val);
            }

            result.add(ans);
        }
        int temp=0;
        for(int i= idx;i<nums.length;i++){
            temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
            all(nums,result,idx+1);
             temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        all(nums,result,0);
        return result;
        
    }
}