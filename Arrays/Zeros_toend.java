
/*Move Zeroes to the End: Shift all zeroes in an array to the end without changing the order of non-zero elements.*/
public class Zeros_toend {
    public static void main(String[] args) {
        int[]nums={1,0,2,0,0,7,3};
        int count=0;//count non-zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If the element is non-zero, move it to the front of the array
                nums[count] = nums[i];
                count++;
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
        for (int e:nums){
            System.out.print(e+" ");

        }
    }
}
