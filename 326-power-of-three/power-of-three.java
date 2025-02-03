class Solution {
    public boolean isPowerOfThree(int n) {
        double lr=Math.log(n)/Math.log(3);
        return Math.abs(lr-Math.round(lr))<1e-10;
    }
}