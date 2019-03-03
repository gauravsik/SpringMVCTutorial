package com.gaurav.springmvc;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}
	
	@Required
	public void setCenter(Point point) {
		this.center = point;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle point is: (" + center.getX() + "," + center.getY() + ")");
	}

}
