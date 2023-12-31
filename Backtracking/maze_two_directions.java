package Backtracking;
 
public class maze_two_directions {
    public static int maze(int sr,int sc,int er,int ec){
    if(sr>er||sc>ec) return 0;
    if (sr==er || sc==ec) return 1;
    int down_ways=maze(sr+1,sc,er,ec);
    int right_ways=maze(sr,sc+1,er,ec);
    int total=down_ways+right_ways;
    return total;
}
    public static void main(String[] args) {
        int r=2;
        int c=2;
        int count= maze(1,1,r,c);
        System.out.println(count);
    }
    
}
