package onlineCourse;

import java.util.Arrays;

public class Array {
	// Class One
	public static void main(String[] args) {
		int[] marks = {1, 2, 3, 4, 5};
		double figure = 0;
		double[] ages = new double[7];
		
		for (double mark:marks) {
			figure = figure + mark;
			System.out.println("Our new figure is "+figure);
		}
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("The value of I is "+marks[i]);
		}
		
		Arrays.fill(ages, 10);
		System.out.println("Ages are "+Arrays.toString(ages));

//		for(double age : ages) {
//			System.out.println("The ages array are "+age);
//		}
	}
}
