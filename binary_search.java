public class binary_search {
    static boolean binarySearch(int []arr,int target){
        int n= arr.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==arr[mid]) return true;
            if(target<arr[mid]){end=mid-1;}
            else{st=mid+1;}
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr={2,5,7,15,20,24,45,50,77};
        int target=24;
        System.out.println(binarySearch(arr,target));
    }
    
}
