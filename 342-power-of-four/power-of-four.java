class Solution {
    public boolean isPowerOfFour(int n) {
        double lr=Math.log(n)/Math.log(4);
        return Math.abs(lr-Math.round(lr))<1e-10;
    }
}