public class mountainArray {
    // This code helps us to find the index of peak element in the array
    static int peak(int[]a){
        int st=0;
        int end=a.length-1;
        int ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]<a[mid+1]){
                ans=mid+1;
                st=mid+1;
            }
            else{end=mid-1;}
        }
        return ans;
    }
    public static void main(String[] args) {
        // finding point in mountain array after which the elements tend to decrease
        int[]a={6,7,8,5,4,3,2,1};
        // we should get index 2 as return because from number 8 the elements are decreasing that means 8 is the peak element ..so the ans will be 2 .
        System.out.println(peak(a));
    }
    
}
