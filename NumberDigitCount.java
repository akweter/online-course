package onlineCourse;

public class NumberDigitCount {
    public static void main(String[] args) {
        System.out.println(countDigits(732));
    }

    public static int countDigits(int number){
        int  vals = 0;
        while (number > 0){
            number = number / 10;
            vals++;
        }
        return vals;
    }

    public static int classCountDigits(int number){
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int  vals = 0;
        while (number > 0){
            number = number / 10;
            vals++;
        }
        return vals;
    }
}
