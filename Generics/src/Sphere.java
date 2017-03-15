/*Aaron Alvarez
March 14 2017
Sphere Class Which Creates a sphere object*/
import java.io.Serializable;

public class Sphere implements Shape,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double radius;

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
		public double getVolume() {
		double volume = (4/3)*Math.PI*Math.pow(this.radius, 3);
			return volume;
		}
	@Override
	public String toString() {
		return "Sphere Radius is " + this.radius + ", volume is " + getVolume();
	}

	
}