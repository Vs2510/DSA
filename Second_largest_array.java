public class Second_largest_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        // the array is sorted then we can retrun array [n-2]
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[n-2]);
        }
    }
    
}
