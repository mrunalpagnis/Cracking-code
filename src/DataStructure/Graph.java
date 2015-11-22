package DataStructure;

import java.util.*;
import java.util.Map.Entry;

public class Graph {

	List<Edge> edges;
	Map<Integer, List<GraphNode>> graph;
	Graph(){
		edges = new ArrayList<Edge>();
		graph = new HashMap<Integer, List<GraphNode>>();
	}
	public void printGraph(){
		Set<Entry<Integer, List<GraphNode>>> eSet = graph.entrySet();
		Iterator<Entry<Integer, List<GraphNode>>> iter = eSet.iterator();
		while(iter.hasNext()){
			Entry<Integer, List<GraphNode>> entry = iter.next();
			System.out.print(""+ entry.getKey()+": [");
			List<GraphNode> list = entry.getValue();
			Iterator<GraphNode> lIter = list.iterator();
			while(lIter.hasNext()){
				System.out.print(" "+lIter.next());
			}
			System.out.println(" ]");
		}
	}
	public void BFStraverse(boolean []visited){
		Queue dst = new Queue();
		Set<Entry<Integer, List<GraphNode>>> eSet = graph.entrySet();
		Iterator<Entry<Integer, List<GraphNode>>> iter = eSet.iterator();
		while(iter.hasNext()){
			Entry<Integer, List<GraphNode>> entry = iter.next();
			if(!visited[entry.getKey()])
			{
				dst.enqueue(entry.getKey());
				visited[entry.getKey()] = true;
			
				while(!dst.isEmpty()){
					int vertex = dst.dequeue();
					System.out.print(""+ vertex+" ");
					List<GraphNode> list = graph.get(vertex);
					Iterator<GraphNode> lIter = list.iterator();
					while(lIter.hasNext()){
						int v = lIter.next().getVertex();
						if(!visited[v])
						{
							dst.enqueue(v);
							visited[v] = true;
						}
					}
				}
			}
		}
	}
	public void printBFS(){
		boolean visited[] = new boolean[graph.size()];
		BFStraverse(visited);
	}
	public void printRecursiveDFS(){
		boolean visited[] = new boolean[graph.size()];
		Set<Entry<Integer, List<GraphNode>>> eSet = graph.entrySet();
		Iterator<Entry<Integer, List<GraphNode>>> iter = eSet.iterator();
		int max = Integer.MIN_VALUE;
		while(iter.hasNext()){
			Entry<Integer, List<GraphNode>> entry = iter.next();
			if(!visited[entry.getKey()]){
				int result = RecursiveDFStraverse(entry.getKey(),visited);
				if(result>max){
					max = result;
				}
			}
		}		
		System.out.println("\nMaximum depth : "+max);
	}
	private int RecursiveDFStraverse(int v, boolean[] visited) {

        visited[v] = true;
        System.out.print(v+" ");
        if(graph.get(v).size()==0){
        	return 0;
        }
        ListIterator<GraphNode> i = graph.get(v).listIterator();
        int max = Integer.MIN_VALUE;
        while (i.hasNext())
        {
            GraphNode n = i.next();
            if (!visited[n.getVertex()]){
            	int result = RecursiveDFStraverse(n.getVertex(),visited);
            	if(result>max){
            		max = result;
            	}
            }
        }
        return max+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge []e = new Edge[8];
		e[0] = new Edge(0,1,3);
		e[1] = new Edge(0,2,1);
		e[2] = new Edge(2,3,2);
		e[3] = new Edge(1,3,2);
		e[4] = new Edge(3,4,5);
		e[5] = new Edge(2,5,2);
		e[6] = new Edge(5,6,2);
		e[7] = new Edge(6,7,2);
		
		Graph g = new Graph();
		for(Edge eg : e){
			g.edges.add(eg);
		}
		for(Edge eg : g.edges){
			
			GraphNode gn = new GraphNode(eg.getV2(),eg.getCost());
			if(g.graph.containsKey(eg.getV1())){
				List<GraphNode> list = (ArrayList<GraphNode>)g.graph.get(eg.getV1());
				list.add(gn);
				g.graph.put(eg.getV1(), list);
			}
			else{
				List<GraphNode> list = new ArrayList<GraphNode>();
				list.add(gn);
				g.graph.put(eg.getV1(), list);
			}
			if(!g.graph.containsKey(eg.getV2())){
				List<GraphNode> list = new ArrayList<GraphNode>();				
				g.graph.put(eg.getV2(), list);
			}
			
		}
		g.printGraph();
		//System.out.println("DFS traversal : ");
		//g.printBFS();
		System.out.println("\nRecursive DFS traversal : ");
		g.printRecursiveDFS();
	}
	
}
