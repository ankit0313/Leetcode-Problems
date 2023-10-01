//Problem Link:- https://leetcode.com/problems/jewels-and-stones/

//Problem Solution in Java:

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(jewels.charAt(j) == stones.charAt(i)){
                    count = count+1;
                }
            }
        }
        return count;
    }

//Another Solution with Time Complexity of O(n + m)  and Space Complexity of O(n) 

     public int numberOfStones(String jewels , String stones){
        int totalStones = 0 ;  // to keep track of stones 
			       
//Using hasmap to keep strack of stones and their occurences
        Map<Character,Integer> freqMap = new HashMap<Character , Integer>();

	//puuting stones into map with freq of occurence 
        for(char c : stones.toCharArray()){
            freqMap.put(c , freqMap.getOrDefault(c , 0) + 1);
        }

	//Checking wether map contains the key or not if yes then adding count 

        for(char ch : jewels.toCharArray()){
            int value = 0 ;
            if(freqMap.containsKey(ch)){
                value = freqMap.get(ch);
            }

            totalStones += value ;
        }

        return totalStones ;
    }





}
