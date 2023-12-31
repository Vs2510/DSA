public class Bsearch {
    public static int binary(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid]==target) return mid;//element found
            //if target greater than mid then ignore left
            if(arr[mid]<target){left=mid+1;}
            else{right=mid-1;}
        }
        return -1;//not found
    }
    public static void main(String[] args) {
        int[]arr={2,5,8,12,14,23,38,42};
        int target=14;
        int res=binary(arr, target);
        if(res!=-1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
    
}
