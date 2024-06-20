package modelo;
import java.util.Comparator;
import java.util.Locale;

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
		return(String.format(Locale.US, "(%.1f,%.1f)",x,y));
	}
	
	@Override
	public int compareTo(Punto o) {
		// TODO Auto-generated method stub
		return Double.compare(this.x,o.getX());
	}
	
	

}
