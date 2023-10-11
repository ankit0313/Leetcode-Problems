//link to problem: https://leetcode.com/problems/longest-common-prefix
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
     String s="";
     int len = strs[0].length();
     for(int i=0;i<strs.length;i++) {
         if (strs[i].length() < len)
         len = strs[i].length();
     }
     for(int i=0;i<len;i++) {
         s+= strs[0].charAt(i);
         for(int j=0;j<strs.length;j++) {
             if(strs[j].startsWith(s)==false) {
             s=s.substring(0,s.length()-1);
             return s;
             }
         }
     }
     return s;
    }
}