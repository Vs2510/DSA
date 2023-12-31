public class prime1 {
    static int isPrime(int n){
        return n;
    }
    public static void main(String[] args) {

        int num=29;
        if(num==0||num==1){
            System.out.println("Not");
        }
        int flag=0;
        int x=num/2;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                flag++;

            }
        }
       if(flag==2){
        System.out.println("Prime");
       }
       else{
        System.out.println("Not");
       }
        
    }
    
}
