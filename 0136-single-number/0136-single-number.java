class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int x:nums){
            ans=ans^x;
        }
        return ans;

        // HashMap<Integer,Integer> hm=new HashMap<>();
        // for(int x:nums){
        //     if(hm.containsKey(x)){
        //         hm.put(x,hm.get(x)+1);
        //     }
        //     else{
        //         hm.put(x,1);
        //     }
        // }
        // for(int i:hm.keySet()){
        //     if(hm.get(i)==1){
        //         return i;
        //     }
        // }
        // return -1;
    }
}