class Solution {
    public int search(int[] nums, int target) {
    //  for(int i=0;i<nums.length;i++){
    //     if(nums[i]==target){
    //         return i;
    //     }
    //  }   
    //  return -1;
     int l=0,r=nums.length-1;
     while(l<=r){
        int m=l+((r-l)/2);
        if(nums[m]>target){
            r=m-1;
        }
        else if(nums[m]<target){
            l=m+1;
        }
        else{
            return m;
        }
     }
     return -1;
    }
}
