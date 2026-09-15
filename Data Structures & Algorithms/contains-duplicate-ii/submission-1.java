class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Brute Force
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j] && Math.abs(i-j)<=k){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        //Optimised Code
        Map<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(arr.containsKey(nums[i]) && i - arr.get(nums[i]) <= k){
                return true;
            }
            arr.put(nums[i],i);
        }
        return false;
    }
}