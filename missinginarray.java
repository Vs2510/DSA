public class missinginarray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,7,8};
        int n=arr.length;
        for (int i=0;i<n;i++){
            if (i!=arr[i]){
                  System.out.println(i);
            }
        }
    }
    
}
