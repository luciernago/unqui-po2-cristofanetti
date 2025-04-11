package ar.edu.unq.po2.tp3;

public class Point {

	private int x = 0;
	private int y = 0;
	
	public Point() {
		super();
	}	
	public Point(int x, int y) {
		super();
		this.moverA(x, y);
	}	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void moverA(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public Point sumarseA(Point p) {
		int xp = p.getX();
		int yp = p.getY();
		Point nuevoPunto = new Point(this.x + xp, this.y + yp);
		return nuevoPunto;		
	}
	
	
	
}
