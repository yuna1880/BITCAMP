package main;


import java.awt.Point;

import cls.Circle;
import cls.Rectagle;
import cls.Shape;


public class mainClass {

	public static void main(String[] args) {
		
		
		
		Shape circle = new Circle(3.0);
		System.out.println(circle.calcArea());
		
		
		Shape rect = new Rectagle(23,34);
		System.out.println(rect.calcArea());
		System.out.println("정사각형 : " + ((Rectagle)rect).isSquare());
	
		
		
		
		
	}

}
