package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * Class Ellipse.
 * @author tpetrov
 */
public class Ellipse extends Curve {
	/**
	 * Default constructor.
	 */
	public Ellipse() {
		
	}
	/**
	 * Constructor with paramethers.
	 * @param eCentre centre point of the ellipse.
	 * @param eWidth width of the ellipse.
	 * @param eHight hight of the ellipse.
	 */
	public Ellipse(Point[] eCentre, float eWidth, float eHight) {
		super(eCentre);
		
	}
	private Point centre;
	private float width;
	private float hight;
	/**
	 * Getter method for centre.
	 *
	 * @return the centre
	 */
	public Point getCentre() {
		return centre;
	}
	/**
	 * Setter method for centre.
	 *
	 * @param centre the centre to set
	 */
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	/**
	 * Getter method for width.
	 *
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}
	/**
	 * Setter method for width.
	 *
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}
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
