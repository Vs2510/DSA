public class firstOccurofelement_arraySorted {
    static int occurence(int[]a,int x){
        int first=-1;
        int n=a.length,st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]==x){
                first=mid;
                end=mid-1;

            }
            else if(x<a[mid]){end=mid-1;}
            else{
                st=mid+1;
            }
        
        }
        return first;
    }
    public static void main(String[] args) {
        int[]arr={2,3,4,5};
        int x=4;
        System.out.println(occurence(arr, x));
        
    }
    
}
