public class sortings2 {
    static void printArray(int []arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int findMax(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){max=arr[i];
            }
        }
        return max;
    }
    static void countSort(int[]arr){
        int n=arr.length;
        int[] output=new int[n];
        int max=findMax(arr);
        int[]count=new int[max+1];//array to store freqiency of elements
        for(int i=0;i<arr.length;i++){
            // make frequency array
            count[arr[i]]++;
        }
        // make prefix sum array
        
       for(int i=1;i<count.length;i++){
        count[i]+=count[i-1];
       }
       // find index of each element in original array and put it in output array
       for(int i=n-1;i>=0;i--){
        int idx=count[arr[i]]-1;
        output[idx]=arr[i];
        count[arr[i]]--;

       }
       // copy all elements of output to array
       for(int i=0;i<n;i++){
        arr[i]=output[i];
       }

}


// special count sort for radix sort
 static void countSort_new(int[]arr,int place){
        int n=arr.length;
        int[] output=new int[n];
        int max=findMax(arr);
        int[]count=new int[10];//array to store freqiency of elements
        for(int i=0;i<arr.length;i++){
            // make frequency array
            count[(arr[i]/place)%10]++;
        }
        // make prefix sum array
        
       for(int i=1;i<count.length;i++){
        count[i]+=count[i-1];
       }
       // find index of each element in original array and put it in output array
       for(int i=n-1;i>=0;i--){
        int idx= count[(arr[i]/place)%10]-1;
        output[idx]=arr[i];
        count[(arr[i]/place)%10]--;

       }
       // copy all elements of output to array
       for(int i=0;i<n;i++){
        arr[i]=output[i];
       }

}
static void radixSort(int[]arr){
    int max=findMax(arr);
    // apply count sort to sort elements based on place value
    for(int place=1;max/place>0;place*=10){
        countSort_new(arr,place);
    }
}
    
    public static void main(String[] args) {
        int[]a={170,45,75,90,802,2};
      //  countSort(a);
      radixSort(a);
        printArray(a);

    }
    
}
