import java.util.*;
class Solution {
    
    public void sub(List<List<Integer>> result, List<Integer> ans, int i, int [] nums ){
        Arrays.sort(nums);
        if(i==nums.length){
            result.add(new ArrayList<Integer>(ans));
            return;
        }
        ans.add(nums[i]);
        sub(result,ans,i+1,nums);
        ans.remove(ans.size()-1);
        int idx = i+1;
        while(idx<nums.length && nums[i]==nums[idx]){
            idx++;
        }
        sub(result,ans,idx,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        sub(result,ans,0,nums);
        return result;
        
    }
}