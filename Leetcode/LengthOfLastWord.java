// link to problem: https://leetcode.com/problems/length-of-last-word
class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
      s=s.trim();
      s=s.replaceAll("\\s+"," ");
      int len=0;
      for(int i=s.length()-1;i>=0;i--) {
        if(s.charAt(i)==' ')
        return len;
        else 
        len++;
      } 
      return len;
    }
}