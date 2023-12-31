public class missing_number {
    public static void main(String[] args) {
        int[]arr={1,2,4,5};
        int sum=0;
        int n=arr.length ;
        int m=n+ 1;//as there is one missing
        System.out.println(m);
        int original_sum=(m*(m+1))/2;
        System.out.println(original_sum);
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        int num=original_sum-sum;
        System.out.println(num);
    }
}
