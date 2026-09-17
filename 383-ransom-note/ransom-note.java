import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
            map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else{
                map.put(magazine.charAt(i),1);
            }

        }
        int j=0;
        while(j<ransomNote.length()){
            if(map.containsKey(ransomNote.charAt(j))){
                map.put(ransomNote.charAt(j),map.get(ransomNote.charAt(j))-1);
                 
                 if(map.get(ransomNote.charAt(j))==0){

                map.remove(ransomNote.charAt(j));
                 }
            }else{
                return false;
            }
            j++;
        }
        return true;
        
        
    }
}