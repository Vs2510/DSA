public class sort0and1 {
    public static void main(String[] args) {
        int []arr={0,1,1,1,0,0,1};
        int n=arr.length;
        int zeros=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                zeros++;
            }

        }
        System.out.println(zeros);
        for (int i=0;i<n;i++){
            if (i<zeros){
                arr[i]=0;

            }
             else{
                arr[i]=1;
            }
        }
        
        
        System.out.println("display");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }} 
    
    

