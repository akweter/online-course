package onlineCourse;

public class Exercise1 {
	private int feet;
	private int inches;

	public static void main(String[] args) {
		System.out.print(false);

	}
	
	public Exercise1(int inches) {
		if(inches < 0) {
			this.feet = -1;
			this.inches = -1;
		}
		else { 
			this.feet = inches/12;
			this.inches = inches % 12;
		}
		
	}
	
	public int getFeet() {
		return feet;
		
	}
	
	public int getinches() {
		return inches;
		
	}
}
