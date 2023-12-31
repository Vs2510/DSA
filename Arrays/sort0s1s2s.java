public class sort0s1s2s {
    public static void main(String[] args) {
        int[]arr={1,0,2,0,1,0,2};
        int c_0=0,c_1=0,c_2=0;
        int num[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            // storing count of number of 0,1,2 in array.
            if(arr[i]==0){
                c_0++;
            }
             if(arr[i]==1){
                c_1++;
            }
             if(arr[i]==2){
                c_2++;
            }
        }
      // Displaying how many zeros ,ones ,two is present
    // System.out.println(c_0 +" "+c_1+" "+c_2);
    for (int i=0;i<c_0;i++){
        num[i]=0;
    }
    for (int i=c_0;i<c_0+c_1;i++){
        num[i]=1;
    }
    for (int i=c_0+c_1;i<num.length;i++){
        num[i]=2;
    }
    for(int e:num){
        System.out.print(e+" ");
    }
    
    }
    
}
