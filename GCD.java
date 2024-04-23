package onlineCourse;

public class GCD {
    public static void main(String[] args) {
        System.out.println(calculateGCD(12, 8));
    }

    private static int calculateGCD(int number1, int number2) {
        int min = Math.min(number1, number2);
        for (int i = min; i > 0; i--) {
            boolean divisible = number1 % i == 0 && number2 % i ==0;
            if (divisible) {
                return i;
            }
        }
        return -1;
    }
}
