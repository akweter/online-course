package onlineCourse;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Cube is: " + (num * num * num));
            System.out.println("Enter a number: ");
            num = input.nextInt();
        }
        while (num >= 0);
        System.out.println("Thank you! Have Fun!");
    }
}
