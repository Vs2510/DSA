public class sort_anarray_whichis_sorted_but_two_elementsare_swapped {
    static void printArray(int []arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[]arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void sortArray(int[]num){
        int n=num.length;
        int x=-1,y=-1;
        // process all adjacent elements
        for(int i=1;i<n;i++){
            if(num[i-1]>num[i]){
                if(x==-1){
                    x=i-1;

                    y=i;

                }
            
            else{
                y=i;
            }
        }
    }
        int tem=num[x];
        num[x]=num[y];
        num[y]=tem;

    }
    public static void main(String[] args) {
        int []num={10,5,6,7,8,9,3};
        sortArray(num);
        printArray(num);
    }
    
}
