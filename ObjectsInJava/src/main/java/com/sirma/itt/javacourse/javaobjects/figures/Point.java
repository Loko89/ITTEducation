package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * Class Point.
 * @author tpetrov
 */
public class Point extends Figure {
	
	private float xCoord;
	private float yCoord;
	/**
	 * Constructor.
	 */
	public Point() {
	
	}
	/**
	 * Constructor with paramethers.
	 * @param xCoord X coord of the point.
	 * @param yCoord Y coord of the point.
	 */
	public Point(float xCoord, float yCoord) {
		
	}
	
	/**
	 * 
	 * @return X coord of the point.
	 */
	public float getxCoord() {
		return xCoord;
	}
	/**
	 * 
	 * @param xCoord sets X coord of the point.
	 */
	public void setxCoord(float xCoord) {
		this.xCoord = xCoord;
	}
	/**
	 * 
	 * @return Y coord of the point.
	 */
	public float getyCoord() {
		return yCoord;
	}
	/**
	 * 
	 * @param yCoord sets Y coord of the point.
	 */
	public void setyCoord(float yCoord) {
		this.yCoord = yCoord;
	}

}
