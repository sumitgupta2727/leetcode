import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        

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
            if(map.containsKey(nums2[j]) ){
                arr.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j]) - 1);
                if(map.get(nums2[j])==0){
                    map.remove(nums2[j]);
                }
            }
        }

        int[] result = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}
    
