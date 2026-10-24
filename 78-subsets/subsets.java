import java.util.*;
class Solution {
    public void all(int []nums , List<Integer> ans , int i , List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<Integer>(ans));
            return;
        }
            ans.add(nums[i]);
            all(nums,ans,i+1,result);
            

            ans.remove(ans.size()-1);
            all(nums,ans,i+1,result);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        all(nums,ans,0,result);
        return result;

        
    }
}