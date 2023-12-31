/*In Java, an equilibrium index in an array is an index where the sum of elements at lower indexes is equal to the sum of elements at higher indexes. */
public class EquilibriumIndex {
    public static int findEquilibrium(int[]arr){
            int sum=0;
        int left_sum=0;
        // finding array sum
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        //finding equilibrium index
        for(int i=0;i<arr.length;i++){
            //update sum to get right sum
            sum=sum-arr[i];//as we move in array
            // check if left sum matches with new sum value 
            if(sum==left_sum){
               return i;
            }
            
            left_sum=left_sum+arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={-7, 1, 5, 2, -4, 3, 0} ;
        System.out.println(findEquilibrium(arr));
    
    }
}
