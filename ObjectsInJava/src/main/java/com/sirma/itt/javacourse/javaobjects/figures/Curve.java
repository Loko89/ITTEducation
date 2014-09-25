package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * @author tpetrov
 */
public class Curve extends Point{

	/**
	 * Constructor.
	 */
	public Curve() {
		
	}
	/**
	 * 
	 * @param points an array of points to shape the curve with.
	 */
	public Curve(Point[] points) {
		
	}
	private Point[] controlPoints;
	/**
	 * 
	 * @return an array of points that shape the curve.
	 */
	public Point[] getControlPoints() {
		return controlPoints;
	}
	/**
	 * 
	 * @param controlPoints an array of points to shape the curve with.
	 */
	public void setControlPoints(Point[] controlPoints) {
		this.controlPoints = controlPoints;
	}

}
