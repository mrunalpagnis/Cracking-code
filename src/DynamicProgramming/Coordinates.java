package DynamicProgramming;

public class Coordinates{
	int x,y;
	public Coordinates(int x, int y){
		this.x = x;
		this.y = y;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	public boolean isValid(int length) {
		if(x<0 || x>=length || y<0 || y>=length)
			return false;
		return true;
	}
	
}