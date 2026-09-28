class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();

        for(int x:nums1){
            h1.add(x);
        }
        for(int x:nums2){
            if(h1.contains(x)){
                h2.add(x);
            }
        }
        int i=0;
        int[] ans=new int[h2.size()];
        for(int x:h2){
            ans[i]=x;
            i++;
        }
        return ans;
    }
}