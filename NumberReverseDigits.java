package onlineCourse;

public class NumberReverseDigits {
    public static void main(String[] args) {
       System.out.println(countDigitRecursively(902));
    }

    public static int countDigitRecursively(int number) {
        int vals = 0;
        while(number > 0){
            int digit = number % 10;
            vals = vals * 10 + digit;
            number = number / 10;
        }
        return vals;
    }
}
