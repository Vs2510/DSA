public class sortan_Arrayof_012 {
    static void sort(int[]a){
        int c0=0,c1=0,c2=0;
        for(int j:a){
            if(j==0){c0++;}
            else if(j==1){c1++;}
            else{c2++;}
        } 
        //Now arranging elements to array accordingly
        int k=0;// to traverse in the array
        while(c0>0){
            a[k++]=0;
            c0--;
        }
        while(c1>0){
            a[k++]=1;
            c1--;

        }
        while(c2>0){
            a[k++]=2;
            c2--;
        }

    }
    public static void main(String[] args) {
        int[]num={2,2,1,2,1,0,1,0,2};
        sort(num);
        for(int e:num){
            System.out.print(e+" ");
        }
        
    }
    
}
