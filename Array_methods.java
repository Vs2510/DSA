import java.util.Scanner;

public class Array_methods {
    static void printArray(int []arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void reverse(int []arr){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
           
            System.out.print(arr[i]+" ");
        }
    }
    static void prefixSum(int[]arr,int[]pref)
    
    {
        int n=arr.length;

        
        for(int i=0;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        
    }
    static int findMax(int []arr){
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i=0;i<n;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondMax(int[]arr){
        
        int mx=findMax(arr);
        int n=arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]==mx){
               arr[i]=Integer.MIN_VALUE;
            }
        }
        int second=findMax(arr);

        return second;
    }
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //sort zeros and ones
    //00001111 <----- 10010110
    static void sortZerosAndOnes(int[]arr){
        int n=arr.length-1;
        int l=0;
        int r=n-1;
        while(l<r){
            if (arr[l]==1&&arr[r]==0){
                swap(arr, l, r);
                l++;
                r--;
            }
            if (arr[l]==0){l++;}
            if (arr[r]==1){r--;}
        }
    }
    // move all even numbers at the beginning of array
    static void sortByParity(int[]arr){
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            if (arr[l]%2==1 && arr[r]%2==0){
                swap(arr, l, r);
                l++;
                r--;
            }
            if (arr[l]%2==0){l++;}
            if (arr[r]%2==1){r--;}
        }
    }

    // return array of squares of each number sorted in non-decreasing
    static int []sortSquare(int []arr){
        int n=arr.length;
        int l=0,r=n-1;
        int []ans=new int[n];
        int k=0;
        while(l<=r){
            if (Math.abs(arr[l])>Math.abs(arr[r])){
                  ans[k++]=arr[l]*arr[l];
                  l++;
            }
            else{
                ans[k++]=arr[r]*arr[r];
                r--;
            }
        }
       return ans;
    }
static void reverse1(int arr[]){
    int i=0;
    int j=arr.length-1;
    while(i<j){
        swap(arr, i, j);
        i++;
        j--;

    }
}
// return prefix sum without creating new array
static int []prefixSum(int []arr){
    int n=arr.length;
    int []pref=new int[n];
    pref[0]=arr[0];
    for (int i=1;i<n;i++){
        pref[i]=pref[i-1]+arr[i];

    }
    return pref;
}


        
      
    
    public static void main(String[] args) {
        int []a1={1,2,3,4,5};
       /*  printArray(a1);
        System.out.println();
        reverse(a1);
        int n=a1.length;
        int []p=new int[n];
        prefixSum(a1,p); 
        int m=findMax(a1);
        System.out.println(m);
        System.out.println(secondMax(a1));*/
          Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the element at :-");
            
            arr[i]=sc.nextInt();
        }

        printArray(arr);
     /*    sortZerosAndOnes(arr);
        System.out.println();
        System.out.println("Sosted array is");
        printArray(arr);
       // sortByParity(arr);
       reverse1(arr);
       System.out.println(sortSquare(arr));
        System.out.println("Sorted array is:");
        printArray(arr); */
       
       int []pref=prefixSum(arr);
       printArray(pref); 
     /*   int []ans=sortSquare(arr);
       System.out.println("sorted");
       reverse(ans);
       printArray(ans); */
        
    }
    
}
