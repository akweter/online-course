package onlineCourse;

public class LCM {

    public static void main(String[] args) {
        System.out.println(calculateLCM(6, 8));
    }

    private static int calculateLCM(int number1, int number2) {
        int max = Math.max(number1, number2);
        int lcm = max;
        while (true){
            boolean isFinalCM = lcm % number1 == 0 && lcm % number2 % 2 ==0;
            if (isFinalCM){
                return lcm;
            }
            lcm += max;
        }
    }
}
