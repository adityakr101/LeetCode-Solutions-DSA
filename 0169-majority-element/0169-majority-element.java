class Solution {
    public int majorityElement(int[] nums) {

        int len=nums.length/2;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }
            else{
                hm.put(x,1);
            }
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>len){
                return i;
            }
        }
        return -1;
    }
}