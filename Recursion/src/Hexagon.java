/*
 * Aaron Alvarez
 * February 8st, 2017
 * Hexagon Object: Creating an hexagon object that contain 6 segments
 * In addition a method that rotates the segments clockwise.
 * */

import java.util.Arrays;

public class Hexagon {
	// attributes
	private int numberOfSegments = 6;
	private String[] hexagonSegments = new String[numberOfSegments];

	// constructor
	// making sure that ColorForSegments in "pgryor"
	// ^^^^^^color format
	public Hexagon(String colorsForSegments) {
		super();
		String[] temp = colorsForSegments.split("");
		hexagonSegments = temp;
	}

	// accesors and modifiers
	public int getNumberOfSegments() {
		return numberOfSegments;
	}

	public void setNumberOfSegments(int numberOfSegments) {
		this.numberOfSegments = numberOfSegments;
	}

	public String[] getHexagonSegments() {
		return hexagonSegments;
	}

	public void setHexagonSegments(String[] hexagonSegments) {
		this.hexagonSegments = hexagonSegments;
	}

	// making a method that enables you to access the element of a certain
	// hexagon
	public String getElement(int indexIn) {
		return hexagonSegments[indexIn];
	}

	// method that rotates the array
	public void rotateOnce() {
		String temp0 = hexagonSegments[0];
		String temp1 = hexagonSegments[1];
		String temp2 = hexagonSegments[2];
		String temp3 = hexagonSegments[3];
		String temp4 = hexagonSegments[4];
		String temp5 = hexagonSegments[5];
		String[] tempArrayRotated = { temp5, temp0, temp1, temp2, temp3, temp4 };
		this.hexagonSegments = tempArrayRotated;	
	}
	
	// tostring
	@Override
	public String toString() {
		return Arrays.toString(hexagonSegments);
	}

}