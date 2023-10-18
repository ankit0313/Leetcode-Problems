import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
        int Slen=s.length();
        int Tlen=t.length();
        if(Slen==Tlen && s.equals(t))
        {
            return t;
        }
        HashMap <Character,Integer> map1=new HashMap<>();
        HashMap <Character,Integer> map2=new HashMap<>();

        for(int i=0;i<Tlen;i++)
        {
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }

        int min=Integer.MAX_VALUE;
        int match=0;
        int j=0;
        String ans="";

        for(int i=0;i<Slen;i++)
        {
            char c=s.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);

            if(map2.containsKey(c) && map1.get(c)<=map2.get(c))
            {
                match++;
            }

            while(match==Tlen)
            {
                if(i-j+1<min)
                {
                    min=i-j+1;
                    ans=s.substring(j,i+1);
                }
                char rem = s.charAt(j);
                if(map1.get(rem)==1)
                {
                    map1.remove(rem);
                }
                else
                {
                    map1.put(rem,map1.get(rem)-1);
                }
                j++;

                if(map2.containsKey(rem) && map1.getOrDefault(rem,0)<map2.get(rem))
                {
                    match--;
                }
            }
        }
        
        return ans;

    }
}
