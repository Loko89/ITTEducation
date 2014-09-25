package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * @author tpetrov
 */
public class Pollyline extends Figure {

	/**
	 * 
	 */
	public Pollyline() {
		
	}
	/**
	 * 
	 * @param points an array of points to shape the curve.
	 */
	public Pollyline(Point[] points) {
		this.pollyLinePoints = points;
	}
	
	private Point[] pollyLinePoints;

	/**
	 * Getter method for pollyLinePoints.
	 *
	 * @return the pollyLinePoints
	 */
	public Point[] getPollyLinePoints() {
		return pollyLinePoints;
	}
	/**
	 * Setter method for pollyLinePoints.
	 *
	 * @param pollyLinePoints the pollyLinePoints to set
	 */
	public void setPollyLinePoints(Point[] pollyLinePoints) {
		this.pollyLinePoints = pollyLinePoints;
	}
	

}
