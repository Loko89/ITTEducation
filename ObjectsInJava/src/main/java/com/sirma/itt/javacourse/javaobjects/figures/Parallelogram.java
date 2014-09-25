package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * @author tpetrov
 */
public class Parallelogram extends Quadrangle {

	/**
	 * 
	 */
	public Parallelogram() {
		
	}

	/**
	 * Constructor with paramethers.
	 * @param first first angle coords.
	 * @param second second angle coords.
	 * @param third third angle coords.
	 * @param forth forth angle coords.
	 * @param pHight hight of the paralleogram.
	 */
	public Parallelogram(Point first, Point second, Point third, Point forth, float pHight) {
		super(first, second, third, forth);
		hight = pHight;
	}
	
	private Point firstAngle;
	private Point secondAngle;
	private Point thirdAngle;
	private Point forthAngle;
	private float hight;
	
	/**
	 * Getter method for hight.
	 *
	 * @return the hight
	 */
	public float getHight() {
		return hight;
	}

	/**
	 * Setter method for hight.
	 *
	 * @param hight the hight to set
	 */
	public void setHight(float hight) {
		this.hight = hight;
	}

}
