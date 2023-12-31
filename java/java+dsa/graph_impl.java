import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graph_impl {
    private LinkedList<Integer> adjacency [];
     public graph_impl(int v){
        adjacency=new LinkedList[v];
        for (int i=0;i<v;i++){
            adjacency[i]=new LinkedList<>();
        }
    }
    public void insertedge(int s,int d){
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    public void bfs(int source){
        //int p;
        
        boolean visited []=new boolean [adjacency.length];
        int parent []=new int [adjacency.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        visited[source]=true;
        parent[source]=-1;
        while( !q .isEmpty()){
                int p=q.poll();
            System.out.print(p);
        
        
            for (int i:adjacency[p]){
                if (visited[i]!=true){
                    visited[i]=true;
                
                      q.add(i);
                       parent[i]=p;
                }
            }
            
        }
    }
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetyr no of vertx and edges");
        int v =sc.nextInt();
        int e=sc.nextInt();
        graph_impl g= new graph_impl(v);
        System.out.println("Enter edges: ");
        for (int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertedge(s, d);
        }
            System.out.println("Enter source: ");
            int source=sc.nextInt();
            g.bfs(source);

        }
    } 
    
    

