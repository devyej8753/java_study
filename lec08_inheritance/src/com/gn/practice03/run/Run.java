package com.gn.practice03.run;

import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Point;
import com.gn.practice03.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		Point p1 = new Point();
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		Circle[] arr = new Circle[2];
		arr[0] = new Circle (1,2,3);
		arr[1] = new Circle (3,3,4);
		
		Rectangle[] arr1 = new Rectangle[2];
		arr1[0] = new Rectangle (-1,-2,5,2);
		arr1[1] = new Rectangle (-2,5,2,8);
		
		System.out.println("=== Circle ===");
		for(Circle num : arr) {
			num.draw();
		}
		System.out.println("=== Rectangle ===");
		for(Rectangle num1 : arr1) {
			num1.draw();
		}
		
		
		
	
	}
}
