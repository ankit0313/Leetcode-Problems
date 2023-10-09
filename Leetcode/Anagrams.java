import java.util.Scanner;
class Anagrams{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.println(isAnagram(a,b)?"Anagram":"Not Anagram");
    }

    public static boolean isAnagram(String a,String b){
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<a.length();i++){
            int index=a.charAt(i)-'a';
            arr[index]++;
        }

        for(int i=0;i<b.length();i++){
            int index=b.charAt(i)-'a';
            arr[index]--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}