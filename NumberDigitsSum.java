package onlineCourse;

public class NumberDigitsSum {
    public static void main(String[] args) {
        System.out.println(countDigitsSum(1234));
    }

    public static int countDigitsSum(int number){
        int sum = 0;
        while (number > 0){
            int val = number % 10;
            sum += val;
            number = number / 10;
        }
        return sum;
    }
}
