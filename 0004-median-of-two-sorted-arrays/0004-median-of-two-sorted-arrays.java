class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int k=0;
        for(int x:nums1){
            arr[k]=x;
            k++;
        }
        for(int x:nums2){
            arr[k]=x;
            k++;
        }
        Arrays.sort(arr);

        int i=0;
        int j=arr.length-1;
        while(i<j){
            i++;
            j--;
        }
        double med=(arr[i]+arr[j])/2.0;
        return med;
    }
}