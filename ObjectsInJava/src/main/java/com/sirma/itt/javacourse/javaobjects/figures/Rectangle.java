package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * @author tpetrov
 */
public class Rectangle extends Parallelogram {

	/**
	 * 
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with paramethers.
	 * @param first first angle coords.
	 * @param second second angle coords.
	 * @param third third angle coords.
	 * @param forth forth angle coords.
	 * @param sideA hight of the rectangle.
	 * @param sideB lenght of the rectangle.
	 */
	public Rectangle(Point first, Point second, Point third, Point forth, float sideA, float sideB) {
		super(first, second, third, forth, sideA);
		this.sideB = sideB;
	}
	private Point firstAngle;
	private Point secondAngle;
	private Point thirdAngle;
	private Point forthAngle;
	private float sideA;
	private float sideB;
	/**
	 * Getter method for sideA.
	 *
	 * @return the sideA
	 */
	public float getSideA() {
		return sideA;
	}

	/**
	 * Setter method for sideA.
	 *
	 * @param sideA the sideA to set
	 */
	public void setSideA(float sideA) {
		this.sideA = sideA;
	}

	/**
	 * Getter method for sideB.
	 *
	 * @return the sideB
	 */
	public float getSideB() {
		return sideB;
	}

	/**
	 * Setter method for sideB.
	 *
	 * @param sideB the sideB to set
	 */
	public void setSideB(float sideB) {
		this.sideB = sideB;
	}
	}
