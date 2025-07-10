// ✅ Leetcode 344. Reverse String
// https://leetcode.com/problems/reverse-string/
// Topic: Arrays, Two Pointers
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
