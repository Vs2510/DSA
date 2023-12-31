public class chocolate_distributions {
    static boolean isDivision(int[]a,int m,int max_choco){
        int numOfStudents=1;
        int choco=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max_choco) return false;
            if(choco+a[i]<=max_choco){choco+=a[i];}
            else{numOfStudents++;
            choco=a[i];}
        }if(numOfStudents>m) return false;
          return true;
    }
    static int distribute(int[]a,int m){
        if(a.length<m) return -1;
        int ans=0,st=1,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivision(a,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{st=mid+1;}
        }
        return ans;
    }
    public static void main(String[] args) {
        // here there is an array of chocolate boxes and we need to distribute it among m number of people.but the distribution should be contigous and atleast 1 to all and a complete box will only be given no division of boxes hall be done.
        int[]a={5,3,1,4,2};
        int m=3;
        System.out.println(distribute(a, m));

    }
    
}
