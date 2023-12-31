/*Find Duplicates: Find the duplicate elements in an array. */
public class find_duplicates {
    public static void main(String[] args) {
        int[]arr= {1, 2, 3, 4, 2, 7, 8, 8, 3};
      //int[]arr={1,2,3,2,3,2,5,1};
        int n=arr.length;
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }
}
