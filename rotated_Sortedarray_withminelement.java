public class rotated_Sortedarray_withminelement {
    static int findMin(int[]a){
        int st=0,end=a.length-1;
        int n=a.length;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]<=a[n-1]){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // 34512 --- this is a sorted rotated array
        // the sorted array is itself divided into two  sorted arrays
        // all elements in 2nd sorted array is less than a[n-1]
        int []arr={3,4,5,1,2};
        System.out.println(findMin(arr)); 
    }
    
}
