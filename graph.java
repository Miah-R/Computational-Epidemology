import java.util.*;//* = LinkedList 
//import java.io.*; for user input
import java.util.Scanner; //to scan file

public class graph{
    int nodes;
    LinkedList<Integer> adjList[];

    public graph (int nodes) {
        this.nodes = nodes;
        adjList = new LinkedList[nodes];
        for(int i = 0; i < nodes; i++){
            adjList[i] = new LinkedList<>();
        }
    }
    
    void addEdge(int source, int destination){
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    void displaygraph(){
        for(int i = 0; i < nodes; i++){
            if(adjList[i].size() > 0){
                System.out.println("Node " +i+ "is connected to");
                for(int j = 0; j < adjList[i].size(); j++){
                    System.out.print(adjList[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int N = s.nextInt();
        graph g = new graph(N);
        for(int i = 0; i < N; i++){
            System.out.println("Enter the source and destination Nodes");
            int src = s.nextInt();
            int dest = s.nextInt();
            g.addEdge(src, dest);
        }
        g.displaygraph();
    }
}