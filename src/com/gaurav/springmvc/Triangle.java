package com.gaurav.springmvc;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {

		for (Point point : points) {
			System.out.print("Triangle co-ordinates ( " + point.getX() + ", " + point.getY() + ")\n");

		}
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable Beans destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Beans init method");
	}
	
	public void myInit() {
		System.out.println("My init method runs");
	}
	
	public void myCleanUp() {
		System.out.println("My cleanUp method runs");
	}
}