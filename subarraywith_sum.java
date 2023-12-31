import java.util.ArrayList;

public class subarraywith_sum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
       ArrayList<Integer> list=new ArrayList<>();
        if(s==0){
            list.add(-1);
            return list;
        }
        int sum=0;
        
        int j=0;
        
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            while(sum>=s){
                if(sum==s){
                    list.add(j+1);
                    list.add(i+1);
                    return list;
                }
                else{
                    sum=sum-arr[j];
                    j++;
                }
            }
        }
        list.add(-1);
        return list;
    }
    
    public static void main(String[] args) {
        
    }
    
}
