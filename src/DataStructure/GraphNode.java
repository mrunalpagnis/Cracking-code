package DataStructure;

public class GraphNode {
	int vertex;
	int dist;
	GraphNode(int vertex, int dist){
		this.vertex = vertex;
		this.dist = dist;
	}
	/**
	 * @return the vertex
	 */
	public int getVertex() {
		return vertex;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + vertex + ", " + dist + ")";
	}
	/**
	 * @param vertex the vertex to set
	 */
	public void setVertex(int vertex) {
		this.vertex = vertex;
	}
	/**
	 * @return the dist
	 */
	public int getDist() {
		return dist;
	}
	/**
	 * @param dist the dist to set
	 */
	public void setDist(int dist) {
		this.dist = dist;
	}
}
