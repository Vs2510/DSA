public class clonearray{
    public static void main(String[] args) {
        int []arr1={2,4,5,1,2};
        int []arr2=arr1.clone();//using clone here provides new stack memory and heap memory for array.
        int n=arr2.length;
        for (int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }

    }

}