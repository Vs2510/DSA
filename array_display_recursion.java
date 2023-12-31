public class array_display_recursion {
    static void array(int []arr,int idx){
          if (idx==arr.length){
            return ;
            }
            System.out.println(arr[idx]);
            array(arr, idx+1);

    }
    public static void main(String[] args) {
        int [] arr={3,5,7,2,5,7};
        array(arr, 0);
        
    }
}
