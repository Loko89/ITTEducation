package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * @author tpetrov
 */
public class Rhombus extends Parallelogram {

	/**
	 * 
	 */
	public Rhombus() {

	}

	/**
	 * Constructor with paramethers.
	 * @param first first anggle coords.
	 * @param second second angle coords.
	 * @param third third angle coords.
	 * @param forth forth anfle coords
	 * @param rhombusSide side lenght of the rhombus.
	 */
	public Rhombus(Point first, Point second, Point third, Point forth, float rhombusSide) {
		super(first, second, third, forth, rhombusSide);
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
