import java.util.Scanner;
public class sortings {
    private static int j;
    static void printArray(int []arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void bubbleSort(int []a){
        int n=a.length;
        for (int i=0;i<n;i++){
            // optimized case
            Boolean flag=false;
            for (int j=0;j<n-i-1;j++){
                // last i elements are already at correct sorted positions.
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            
           
        }
         if (flag==false){return;}
    }
    }
    static void selectionSort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            // i is the current index
            //find min in unsorted
            int min=i;
            for(int j=i+1;j<n;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
           
            }
             int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    static void insertionSort(int[]a){
        int n=a.length;
        for (int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    static void swap(int[]arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition (int []arr,int start,int end){
        int pivot=arr[start];
        int count=0;
        for(int i=start+1;i<=end;i++){
            if(arr[i]<=pivot) 
            { count++;}

        }
        int pivot_inx=start+count;
        swap(arr,start,pivot_inx);
        int i=start;
        int j=end;
        while(i<pivot_inx&& j>pivot_inx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot)j--;
            if(i<pivot_inx && j>pivot_inx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivot_inx;
    }
    static void quickSort(int []arr,int st,int end){
        if(st>=end) return;
        int p=partition(arr, st, end);
        quickSort(arr, st, p-1);
        quickSort(arr, p+1, end);
    }
static void merge(int[]arr,int l,int mid,int r){
    int n1=mid-l+1;//for left arr
    int n2=r-mid;//for right arr;
    int []left=new int[n1];
    int []right=new int[n2];
    int i,j,k;
    for(i=0;i<n1;i++){
        left[i]=arr[l+i];

    }
    for(j=0;j<n2;j++){
        right[j]=arr[mid+1+j];

    }
    i=0;j=0;k=l;
    while(i<n1 && j<n2){
        if(left[i]<right[j]){
            arr[k++]=left[i++];
        }
        else{
            arr[k++]=right[j++];
        }
    }
    while(i<n1) arr[k++]=left[i++];
    while(i<n2) arr[k++]=right[j++];
}
static void mergesort(int []arr,int l,int r){
    if(l>=r) return;
    int mid=(l+r)/2;
    mergesort(arr, l, mid);
    mergesort(arr, mid+1, r);
    merge(arr, l, mid, r);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int []a=new int [n];
        for (int i=0;i<n;i++){
            System.out.print("Enter the elements: ");
            a[i]=sc.nextInt();
        }
        printArray(a);
       // bubbleSort(a);
       //selectionSort(a);
      // insertionSort(a);
     // quickSort(a, 0, n-1);
     mergesort(a, 0, n-1);
        System.out.println();
        printArray(a);
        
    }
    
}
