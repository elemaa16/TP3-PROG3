import java.util.Comparator;

public class Punto implements Comparable<Punto> {
	private double x;
	private double y;
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	@Override
	public String toString() {
		return "x : " + String.format("%.1f ",x) + " y :" + String.format("%.1f ",y);
	}
	
	@Override
	public int compareTo(Punto o) {
		// TODO Auto-generated method stub
		if(this.getX()>o.getX())
		{
			return 1;
		}
		else if (this.getX()<o.getX()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	

}
