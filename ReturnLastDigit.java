package onlineCourse;

public class ReturnLastDigit {
    public static void main(String[] args) {
        System.out.println(lastDidgit(10));
    }

    public static int lastDidgit(int number){
        return number % 10;
    }

    public static int classlastDigit(int number){
        if (number < 0){
            return -1;
        }
        return number % 10;
    }
}
