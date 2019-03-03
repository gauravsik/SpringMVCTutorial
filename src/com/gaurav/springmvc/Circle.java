package com.gaurav.springmvc;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point point) {
		this.center = point;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle point is: (" + center.getX() + "," + center.getY() + ")");
	}

}
