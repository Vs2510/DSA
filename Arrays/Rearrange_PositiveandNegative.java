public class Rearrange_PositiveandNegative {
    public static void rearrange(int[] nums) {
        int n = nums.length;
        int p_count = 0, n_count = 0;
        
        // Count positive and negative numbers
        for (int num : nums) {
            if (num > 0) {
                p_count++;
            } else {
                n_count++;
            }
        }
        
        int[] positive = new int[p_count];
        int[] negative = new int[n_count];
        
        // Separate positive and negative into separate arrays
        int pIndex = 0, nIndex = 0;
        for (int num : nums) {
            if (num > 0) {
                positive[pIndex++] = num;
            } else {
                negative[nIndex++] = num;
            }
        }
        
        // Rearrange the original array with positive and negative elements alternatively
        int p = 0, neg = 0, index = 0;
        while (p < p_count && neg < n_count) {
            nums[index++] = positive[p++];
            nums[index++] = negative[neg++];
        }
        
        // Add remaining positive elements if any
        while (p < p_count) {
            nums[index++] = positive[p++];
        }
        
        // Add remaining negative elements if any
        while (neg < n_count) {
            nums[index++] = negative[neg++];
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        rearrange(nums);
        for (int n1 : nums) {
            System.out.print(n1 + " ");
        }
    }
}
