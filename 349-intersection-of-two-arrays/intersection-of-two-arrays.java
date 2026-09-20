import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map =new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
            map.put(nums1[i],map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j]) && !arr.contains(nums2[j]) ){
                arr.add(nums2[j]);
            }
        }

        int[] result = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}