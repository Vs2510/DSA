public class countelementsgreterthanx {
    public static void main(String[] args) {
        int []arr={1,4,7,8,9,2};
        int x=5;
        int count =0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]<x){
                   count++;
            }
           

        }
         System.out.println("The elements greter than "+ x + " is " + count);

        
    }
    
}
