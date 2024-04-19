package onlineCourse;

import java.math.BigDecimal;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfmarks() {
		return marks.length;
	}

	public int getTotalSumifMarks() {
		int sum = 0;
		for (int mark:marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximunMark() {
		int max = Integer.MIN_VALUE;
		for (int mark : marks) {
			if(mark > max) {
				max = mark;
			}
		}
		return max;
	}

	public int getMinimunMark() {
		int min = Integer.MAX_VALUE;
		for(int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;
	}

	public BigDecimal getAverageMark() {
		int sum  = getTotalSumifMarks();
		int number = getNumberOfmarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number));
	}

}
