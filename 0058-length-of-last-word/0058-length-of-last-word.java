class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char[] c=s.toCharArray();
        int count=0;
        for(int i=c.length-1;i>=0;i--){
            if(c[i]!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}