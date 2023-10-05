class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> hashmap = new HashMap<>();
        
        hashmap.put('I', 1);
        hashmap.put('V', 5);
        hashmap.put('X', 10);
        hashmap.put('L', 50);
        hashmap.put('C', 100);
        hashmap.put('D', 500);
        hashmap.put('M', 1000);

        int ans=0;
        for (int i = 0; i < s.length(); i++) {
             if (i < s.length() - 1 && hashmap.get(s.charAt(i)) < hashmap.get(s.charAt(i + 1))) {
                ans -= hashmap.get(s.charAt(i));
            } else {
                ans += hashmap.get(s.charAt(i));
            }
        }
        

        return ans;
    }
}