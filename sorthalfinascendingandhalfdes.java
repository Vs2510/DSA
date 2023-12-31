
public class sorthalfinascendingandhalfdes {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
        int t;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                if (arr[j]>arr[j+1]){
                     t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
            for (int j=n/2;j<n-1;j++){
                 if (arr[j]<arr[j+1]){
                     t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
           

        }
        for (int i=0;i<arr.length;i++){
                        
          System.out.println(arr[i]);
        }
       
    }
    
}
