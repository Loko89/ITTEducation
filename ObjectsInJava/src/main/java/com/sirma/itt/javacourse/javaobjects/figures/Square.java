package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * @author tpetrov
 */
public class Square extends Rectangle {

	/**
	 * 
	 */
	public Square() {
		
	}

	/**
	 * Constructor with paramethers.
	 * @param first first angle coords.
	 * @param second second angle coords.
	 * @param third third angle coords.
	 * @param forth forth angle coords.
	 * @param side side lenght of the square.
	 */
	public Square(Point first, Point second, Point third, Point forth, float side) {
		this.firstAngle = first;
		this.secondAngle = second;
		this.thirdAngle = third;
		this.forthAngle = forth;
		this.side = side;
	}
	private Point firstAngle;
	private Point secondAngle;
	private Point thirdAngle;
	private Point forthAngle;
	private float side;
	/**
	 * Getter method for side.
	 *
	 * @return the side
	 */
	public float getSide() {
		return side;
	}

	/**
	 * Setter method for side.
	 *
	 * @param side the side to set
	 */
	public void setSide(float side) {
		this.side = side;
	}

}
