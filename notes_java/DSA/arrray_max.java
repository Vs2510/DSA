public class arrray_max {
    public static void main(String[] args) {
        int [] arr={1,7,9,4};
        int i;
        int max;
        max=arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The largest element is : " + max);
    }
    
}
