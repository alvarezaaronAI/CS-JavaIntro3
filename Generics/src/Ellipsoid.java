/*Aaron Alvarez
March 14 2017
Ellipsoid Class which creates an ellipsoid object*/
import java.io.Serializable;

public class Ellipsoid implements Shape,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double firstRadius,secoundRadius,thirdRadious;

	public Ellipsoid(double firstRadious, double secoundRadious, double thirdRadious) {
		super();
		this.firstRadius = firstRadious;
		this.secoundRadius = secoundRadious;
		this.thirdRadious = thirdRadious;
	}

	public double getFirstRadious() {
		return firstRadius;
	}

	public void setFirstRadious(double firstRadious) {
		this.firstRadius = firstRadious;
	}

	public double getSecoundRadious() {
		return secoundRadius;
	}

	public void setSecoundRadious(double secoundRadious) {
		this.secoundRadius = secoundRadious;
	}

	public double getThirdRadious() {
		return thirdRadious;
	}

	public void setThirdRadious(double thirdRadious) {
		this.thirdRadious = thirdRadious;
	}
	@Override
		public double getVolume() {
			double volume = (4/3)*Math.PI*this.firstRadius*this.secoundRadius*this.thirdRadious;
			return volume;
		}
	@Override
	public String toString() {
		return "Ellipsoid First Radious is " + firstRadius + ", Second Radious is " + secoundRadius + ", Third Radious is "
				+ thirdRadious + ", volume is " + getVolume();
	}

	
	
}