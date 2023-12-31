public class maxarray_recursion {
    static int maxofArray(int [] arr,int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }
        int small=maxofArray(arr,idx+1);
        return Math.max(arr[idx], small);
    }
    public static void main(String[] args) {
        int [] arr={4,3,1,8,7};
        System.out.println(maxofArray(arr, 0));
        
    }
    
}
