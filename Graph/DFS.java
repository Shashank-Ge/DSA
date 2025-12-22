import java.util.Scanner ;
import java.util.ArrayList ;
import java.util.List;

public class DFS {
    public static void main ( String [] args ) {
     Scanner sc = new Scanner ( System.in) ;

     System.out.print("Enter the number of nodes : ");
     int n = sc.nextInt() ;
     System.out.print("Enter the number of edges : ") ;
     int m = sc.nextInt() ;

     List <List<Integer>> adjList = new ArrayList <>(n+1) ;

     for ( int i = 0 ; i <= n ; i++ ) {
        adjList.add(new ArrayList<>() ) ;
     }

     // adding the edges to the adjacency list
     for ( int j = 0 ; j <= m ; j++ ){
        System.out.print("start of edge : ");
        int u = sc.nextInt() ;

        System.out.print("End of edge : ") ;
        int v = sc.nextInt() ;

        adjList.get(u).add(v) ;
        adjList.get(v).add(u) ;
     }


        System.out.print ("The DFS traversal is : ");
        performDFS ( n , adjList ) ;
    }

    static void performDFS ( int numNodes , List <List<Integer>> adjList  ){
        boolean [] visited = new boolean [numNodes + 1 ];

        for ( int i = 1 ; i <= numNodes ; i++ ) {
            if (!visited[i]) {
                dfs (i , visited , adjList ) ;
            }
        }
    }

    static void dfs (int node , boolean[] visited , List<List<Integer>> adjList ) {
        visited[node] = true ;

        System.out.print (node + " ") ;

        for ( int neighbour : adjList.get(node) ) {
            if (!visited[neighbour]) {
                dfs(neighbour , visited , adjList ) ;
            }
        }
    }


}
