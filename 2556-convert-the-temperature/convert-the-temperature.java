class Solution {
    public double[] convertTemperature(double celsius) {
        double f=(9*celsius)/5+32;
        double k=celsius+273.15;
        return new double[]{k,f};
    }
}