class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int r;
        int rev=0;
        int save=x;
        while(x!=0){
            r=x%10;
            x=x/10;
            rev=rev*10+r;
        }
        return save==rev;
    }
}