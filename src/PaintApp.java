//package com.estsoft.paint.app;
public class PaintApp {
	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
		Shape s1 = new Shape(p1);
		Point p2 = new Point(7, 10);
		Shape s2 = new Shape(p2);
		Point p3 = new Point(10, 23); 
		Shape s3 = new Shape(p3);
		s1.show();
		s2.show(true);
		s3.show(false);
	}
}
