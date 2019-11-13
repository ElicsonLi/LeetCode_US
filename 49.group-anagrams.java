import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    /** 
     * use a new class to fit the hashmap getprDefault
     * cost a lot of time
    */
    /*
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> res = new LinkedList<>();
    	temp[]  keys = new temp[strs.length];
    	for(int i = 0; i < keys.length; i ++){
    		keys[i] = new temp(strs[i]);
    	}
    	HashMap<temp,List<String>> hm = new HashMap();
    	for(int i = 0; i < keys.length; i ++){
    		List<String> x = hm.getOrDefault(keys[i], new LinkedList<String>());
    		x.add(keys[i].recover());
    		hm.put(keys[i], x);
    	}
    	for(temp t : hm.keySet()){
    		res.add(hm.get(t));
    	}
    	
        return res;
    }

    class temp{
        int[] t;
        String x;
        temp(String s ){
        	x = s;
            t = new int[26];
            for(char c : s.toCharArray()){
                t[c - 'a'] ++;
            }
        }

        @Override
        public boolean equals(Object obj){
        	if(obj == null)  return false;
        	if(obj == this)  return true;
        	if(obj.getClass() != this.getClass())  return false;
        	temp others = (temp) obj;
        	for(int i = 0 ; i < 26; i ++){
        		if(this.t[i] != others.t[i]){
        			return false;
        		}
        	}
        	return true;
        }
        @Override
        public int hashCode(){
        	int sum = 0;
        	for(int i : t){
        		sum += i;
        	}
        	return sum;
        }
        
        public String recover(){
        	return x;
        }
    }
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i ++){
            char[] cs = strs[i].toCharArray();
            Arrays.sort(cs);
            String key = String.valueOf(cs);
            List<String> l = hm.getOrDefault(key, new LinkedList<String>());
            l.add(strs[i]);
            hm.put(key,l);
        }

        return new LinkedList<List<String>>(hm.values());
        
    }
}
// @lc code=end

