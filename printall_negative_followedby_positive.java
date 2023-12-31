public class printall_negative_followedby_positive {
    static void partition(int[]num){
        int l=0,r=num.length-1;
        while(l<r){
            while(num[l]<0) l++;
            while(num[r]>=0)r--;
            if(l<r){
                int temp=num[l];
                num[l]=num[r];
                num[r]=temp;
                l++;r--;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={3,-1,5,-4,-3,7};
        partition(arr);
        for(int e:arr){
            System.out.print(e+ " ");
        }
        
    }
    
}
