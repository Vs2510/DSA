import java.util.Arrays;

public class pair_withgivenSum {
    public static void findPairs(int[]arr,int targetSum){
        int n=arr.length;
        //sort arrays
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<right){
            int currSum=arr[left]+arr[right];
            if(currSum==targetSum){
                System.out.println("The pairs are: " + arr[left]+" "+ arr[right]);
                left++;
                right--;

            }
            else if(currSum<targetSum){left++;}
            else{right--;}
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int targetSum = 7;

        System.out.println("Pairs with sum " + targetSum + ":");
        findPairs(arr, targetSum);
    }
    
}
