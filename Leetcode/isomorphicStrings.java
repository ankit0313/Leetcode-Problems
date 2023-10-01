// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			Character sCh = s.charAt(i);
			Character tCh = t.charAt(i);
			
			if(mp.containsKey(sCh)) {
				if(mp.get(sCh) != tCh) return false;
			} else if(mp.containsValue(tCh)) {
				return false;
			} else {
				mp.put(sCh, tCh);
			}
		}
		return true;
    }
}