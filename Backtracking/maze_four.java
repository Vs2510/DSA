package Backtracking;

public class maze_four {
    static void print(int sr,int sc,int er,int ec,String S,int[][]maze,boolean [][]isVisited){
        if(sr<0||sc<0) return;
        if (sr>er || sc>ec) return;
        if(sr==er && sc==ec) {
            System.out.println(S);
            return;
        }
        if (maze[sr][sc]==0) return ;//blocked
       if (isVisited[sr][sc]==true) return;
        isVisited[sr][sc]=true; 
        
      
        //right
        print(sr,sc+1,er,ec,S+"R",maze,isVisited);
        // down
          print(sr+1,sc,er,ec,S+"D",maze,isVisited);
          //left
            print(sr,sc-1,er,ec,S+"L",maze,isVisited);
        //up
            print(sr-1,sc,er,ec,S+"U",maze,isVisited);
        // backtracking
        isVisited[sr][sc]=false;
    }
    public static void main(String[] args) {
        int r=3;
        int c=4;
        int [][]maze={{1,0,1,1},
                       {1,1,1,1},
                        {1,1,0,1}};
        boolean [][]visited=new boolean[r][c];
        print(0, 0, r-1, c-1, "", maze, visited);


    }
    
}
