package DataStructure;

public class Edge {
	int v1;
	int v2;
	int cost;
	Edge(int v1,int v2,int cost){
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	/**
	 * @return the v1
	 */
	public int getV1() {
		return v1;
	}
	/**
	 * @param v1 the v1 to set
	 */
	public void setV1(int v1) {
		this.v1 = v1;
	}
	/**
	 * @return the v2
	 */
	public int getV2() {
		return v2;
	}
	/**
	 * @param v2 the v2 to set
	 */
	public void setV2(int v2) {
		this.v2 = v2;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
}
