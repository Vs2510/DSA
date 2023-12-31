public class array_rotation {
    // function to rotate array to right by k steps
    public static void rotate(int[]nums,int steps){
        if(nums==null||nums.length==0||steps<0){
            throw new IllegalArgumentException("Invalid input");
        }
        int length=nums.length;
        steps=steps%length;
        //reverse entire array
        reverse(nums,0,length-1);
        // reverse upto steps-1
        reverse(nums,0,steps-1);
        // reverse rest elements
        reverse(nums,steps,length-1);
    }
    // function to reverse array or a portion of it
    public static void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[]nums){
        for (int e:nums){
            System.out.print(e+" ");
           
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int steps=2;
        System.out.println("original array:");
        printArray(arr);
        System.out.println(" ");
        rotate(arr, steps);
        System.out.println("Rotated array:");
        printArray(arr);
    }
    
}
