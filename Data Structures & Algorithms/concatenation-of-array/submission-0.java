class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int n=nums.length+arr.length;
        int[] concat=new int[n];
        for(int i=0;i<nums.length;i++){
            concat[i]=nums[i];
        }
        int m=nums.length;
        for(int i=m;i<concat.length;i++){
            concat[i]=arr[i-m];
        }
        return concat;
       
        
        
    }
}