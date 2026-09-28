class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int[] ans=new int[2];

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            if(hm.containsKey(target-x)){
                ans[0]=hm.get(target-x);
                ans[1]=i;
            }
            else{
                hm.put(x,i);
            }
            i++;
        }
        return ans;
    }
}
