class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            // Shift result left to make space
            result <<= 1;
            // Take the last bit of n and add to result
            result |= (n & 1);
            // Shift n right to process next bit
            n >>>= 1; // unsigned shift
        }
        return result;
    }
}