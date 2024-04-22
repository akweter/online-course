package onlineCourse;

public class MultiplyFactors {

    public static void main(String[] args) {
//        System.out.println(calculateFactorial(4));
        System.out.println(multiPly(4));
    }

//    From self
    public static int calculateFactorial(int number) {
        int sum = 0;

        if (number < 0){
            return -1;
        } else {
            for (int i = 1; i <= number; i++){
                if(number % i == 0){
                    sum += i;
                }
            }
            return sum;
        }
    }

//    From class
    public static int multiPly(int number){
        if (number < 0){
            return -1;
        }
        int factorial = 1;
        for (int i = 2; i<= number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
