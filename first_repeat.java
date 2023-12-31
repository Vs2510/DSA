public class first_repeat {
    public static void main(String[] args) {
        int[]arr={1, 5, 3, 4, 3, 5, 6};
        int n=arr.length;
        for (int i=1;i<=n;i++){
            if(arr[i]==arr[i+1]){
                return i;
            }
        }
    }
    
}
