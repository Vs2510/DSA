public class sumofArray_recursion {
    static int Arraysum(int []arr,int idx){
        if (idx==arr.length){
            return 0;
        }
        int small=Arraysum(arr, idx+1);
        return small+arr[idx];
    }
    public static void main(String[] args) {
        int []arr={3,5,7,2};
        System.out.println(Arraysum(arr, 0));
        
    }
    
}
