



int minMovesToMakePalindrome(string s){
    
    int n = s.length();
    int i = 0;
    int j = n-1;
    int ans = 0;

    while(i < j){

        if(s[i]==s[j]){
            // both Characters are same move 2 pointers
            i++;
            j--;
        }
        else{
            // both characters are not same. We have to make jth index char == s[i]. For this, find the char closest to j which is equle to s[i]
            // once we find this char, do swaps and bring this char to jth index.
            int found = -1;
            // find index nearest to j which matches with i index
            for(int k=j-1; k>i; k--){
                if(s[k] == s[i]){
                    found = k;
                    break;
                }
            }
            
            // found the character which is equal to s[i]
            if(found > 0){
                for(int k=found; k<j; k++){
                    swap(s[k], s[k+1]);
                    ans++;
                }
                // now char at index i and j are equle so move both pointers
                i++;
                j--;
            }
            else{
                // if not found means that character at ith index is odd character. so swap it so it would eventually end at middle of string
                swap(s[i], s[i+1]);
                ans++;
            }
            
        }
    }

    return ans;

}


