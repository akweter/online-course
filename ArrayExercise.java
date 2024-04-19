/**
 * 
 */
package onlineCourse;

import java.math.BigDecimal;

public class ArrayExercise {

	public static void main(String[] args) {
		int[] marks = {50, 9, 61};
		
		Student student = new Student("James", marks);
		
		int length = student.getNumberOfmarks();
		System.out.println("number length is: "+length);
		
		int sum = student.getTotalSumifMarks();
		System.out.println( "number sum is: "+ sum);
		
		int max = student.getMaximunMark();
		System.out.println( "number max is: "+ max);
		
		int min = student.getMinimunMark();
		System.out.println( "number min is: "+ min);
		
		BigDecimal average = student.getAverageMark();
		System.out.println( "number average is: "+ average);
	}
}
