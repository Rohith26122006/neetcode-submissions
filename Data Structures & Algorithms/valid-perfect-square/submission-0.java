public class Solution {
    public boolean isPerfectSquare(int num) {
        int sqRoot = (int) Math.sqrt(num);
        return sqRoot * sqRoot == num;
    }
}