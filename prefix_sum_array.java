public class prefix_sum_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int n=arr.length;
        int []pref=new int[n];
        pref[0]=arr[0];
        for (int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];

        }
        System.out.println("Display");
        for (int i=0;i<n;i++){
            System.out.print(pref[i]+" ");
        }
    }
    
}
