public class slection_sort_trial {
    static void selection(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    static void printArray(int []arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]a={5,4,2,1,3};
        selection(a);
        printArray(a);        
    }
    
}
