import java.util.*;
class Solution {
    public int numberOfSubstrings(String s) {
    HashMap<Character, Integer> map=new HashMap<>();
    int i=0;
    int j=0;
    int count =0;
    while(j<s.length()){
        if(map.containsKey(s.charAt(j))){
            map.put(s.charAt(j),map.get(s.charAt(j))+1);
        }else{
            map.put(s.charAt(j),1);
        }
        while(map.containsKey('a') && 
            map.containsKey('b') && 
              map.containsKey('c')){

            count+=s.length()-j;
            
            if(map.get(s.charAt(i))==1){
                map.remove(s.charAt(i));
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
            }
            i++;
        }
        j++;
    }
    
    return count;
    
    }
}