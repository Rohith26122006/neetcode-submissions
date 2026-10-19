class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache=new int[n]; //Creating a new array so that we can store the hash values and then the technique is called memoziation
        for(int i=0;i<n;i++){
            cache[i]=-1;
        }
        return dfs(n,0);
    }
    public int dfs(int n,int i){
        if(i>=n) return i==n? 1:0;
        if(cache[i]!=-1) return cache[i];
        return cache[i]=dfs(n,i+1)+dfs(n,i+2);
    }
}
