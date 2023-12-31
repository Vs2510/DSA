public class lastoccurrence {
    public static void main(String[] args) {
        int []arr={1,5,3,2,5,7,5,9};
        int n=arr.length;
        int last=-1;
        int x=3;
        for (int i=0;i<n;i++){
           if (arr[i]==x){
            last=i;

           }
        }
        System.out.println(last);
    }
    
}
