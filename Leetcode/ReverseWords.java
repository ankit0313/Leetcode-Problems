// link to problem: https://leetcode.com/problems/reverse-words-in-a-string
class ReverseWords {
    public String reverseWords(String s) {
      String rev ="";
      s=s.replaceAll("\\s+"," ");
      String arr[] = s.split(" ");
      for(int i=arr.length-1;i>=0;i--) 
        rev+= arr[i]+" ";
        rev=rev.trim();
        return rev;
    }
}