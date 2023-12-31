public class uniqueinArray {
    public static void main(String[] args) {
        int[]arr={1,5,7,1,7};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        System.out.println("The unique number is: ");
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=-1){
                System.out.println(arr[i]);
            }
        }
    }
    
}
