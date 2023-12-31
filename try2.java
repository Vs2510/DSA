public class try2 {
    public static void main(String[] args) {
        int[] arr = {19, 2, 0, 87, 1, 40, 80, 77, 77, 77};
        int[] modifiedArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
           
            int prev = (i > 0) ? arr[i - 1] : Integer.MAX_VALUE;
            int next = (i < arr.length - 1) ? arr[i + 1] : Integer.MAX_VALUE;
            
            if (arr[i] <= prev && arr[i] <= next) {
                modifiedArr[i] = 0;
            } else {
                modifiedArr[i] = arr[i];
            }
        }
        
        
        for (int i = 0; i < modifiedArr.length; i++) {
            System.out.print(modifiedArr[i] + " ");
        }
    }
}
