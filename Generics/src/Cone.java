import java.io.Serializable;

public class Cone implements Shape,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3662618384324883783L;
	private double height,radius;
	public Cone(double height, double radious) {
		super();
		this.height = height;
		this.radius = radious;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getRadious() {
		return radius;
	}
	public void setRadious(double radious) {
		this.radius = radious;
	}
	@Override
	public double getVolume() {
		double volume = (1/3.0)*Math.PI*Math.pow(this.radius, 2)*this.height;
		return volume;
	}
	@Override
	public String toString() {
		return "Cone height is " + height + ", radious is " + radius+ ", volume is " + getVolume();
	}

	
}