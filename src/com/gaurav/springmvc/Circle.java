package com.gaurav.springmvc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point point) {
		this.center = point;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle point is: (" + center.getX() + "," + center.getY() + ")");
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Initialized Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroyed Circle"); 
	}

}
