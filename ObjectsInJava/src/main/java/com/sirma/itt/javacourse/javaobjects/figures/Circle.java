package com.sirma.itt.javacourse.javaobjects.figures;
/**
 * 
 * @author tpetrov
 */
public class Circle extends Ellipse {
	
	private Point centre;
	private float radius;
	
	/**
	 * Constructor.
	 */
	public Circle(){
		
	}
	/**
	 * Constructor with paramethers.
	 * @param circleCentre centre point of the circle.
	 * @param circleRadius radius of the circle.
	 */
	public Circle(Point circleCentre, float circleRadius){
		super();
		radius = circleRadius;
	}
	
	
	/**
	 * Getter method for radius.
	 *
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}
	/**
	 * Setter method for radius.
	 *
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	/**
	 * 
	 * @param x coord x.
	 * @param y coord y.
	 */
	public void setCoords(float x, float y) {
		 centre.setxCoord(x);
		 centre.setyCoord(y);
	}
}
