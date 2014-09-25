package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * @author tpetrov
 */
public class Quadrangle extends Figure {

	/**
	 * Constructor.
	 */
	public Quadrangle() {

	}
	/**
	 * Constructor with paramethers.
	 * @param first first angle coords.
	 * @param second second angle coords.
	 * @param third third angle coords.
	 * @param forth forth angle coords.
	 */
	public Quadrangle(Point first, Point second, Point third, Point forth) {
		
	}
	
	private Point firstAngle;
	private Point secondAngle;
	private Point thirdAngle;
	private Point forthAngle;
	/**
	 * Getter method for firstAngle.
	 *
	 * @return the firstAngle
	 */
	public Point getFirstAngle() {
		return firstAngle;
	}
	/**
	 * Setter method for firstAngle.
	 *
	 * @param firstAngle the firstAngle to set
	 */
	public void setFirstAngle(Point firstAngle) {
		this.firstAngle = firstAngle;
	}
	/**
	 * Getter method for secondAngle.
	 *
	 * @return the secondAngle
	 */
	public Point getSecondAngle() {
		return secondAngle;
	}
	/**
	 * Setter method for secondAngle.
	 *
	 * @param secondAngle the secondAngle to set
	 */
	public void setSecondAngle(Point secondAngle) {
		this.secondAngle = secondAngle;
	}
	/**
	 * Getter method for thirdAngle.
	 *
	 * @return the thirdAngle
	 */
	public Point getThirdAngle() {
		return thirdAngle;
	}
	/**
	 * Setter method for thirdAngle.
	 *
	 * @param thirdAngle the thirdAngle to set
	 */
	public void setThirdAngle(Point thirdAngle) {
		this.thirdAngle = thirdAngle;
	}
	/**
	 * Getter method for forthAngle.
	 *
	 * @return the forthAngle
	 */
	public Point getForthAngle() {
		return forthAngle;
	}
	/**
	 * Setter method for forthAngle.
	 *
	 * @param forthAngle the forthAngle to set
	 */
	public void setForthAngle(Point forthAngle) {
		this.forthAngle = forthAngle;
	}
	
}
