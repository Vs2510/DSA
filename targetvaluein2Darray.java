public class targetvaluein2Darray {
static boolean search(int[][]a,int target){
    int n= a.length;// rows
    int m=a[0].length;//columns
    int st=0,end=n*m-1;
    while(st<=end){
        int mid=st+(end-st)/2;
        int mid_element=a[mid/m] [mid%m];
        if(mid_element==target) return true;
        if(target<mid_element){end=mid-1;}
        else{st=mid+1;}
    }
    return false;
}
    public static void main(String[] args) {
        // 1 3 5 7
        // 10 11 16 20
        // 22 30 34 60
        //integers in each row are sorted from left to right
        // first integer in each row is greater then last of prevoius one

        
    }
    
}
