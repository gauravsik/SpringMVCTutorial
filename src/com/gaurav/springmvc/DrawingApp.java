package com.gaurav.springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("*****Coding to Implementation*****");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		
		System.out.println("*****Coding to Interfaces*****");
		
		Shape shape1 = (Shape) context.getBean("triangle");
		shape1.draw();
		
		Shape shape2 = (Shape) context.getBean("circle");
		shape2.draw();
	}

}
