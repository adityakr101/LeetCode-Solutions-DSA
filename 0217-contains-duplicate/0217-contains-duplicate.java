class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            if(hm.containsKey(x)){
                return true;
            }
            else{
                hm.put(x,1);
            }
        }
        return false;
    }
}