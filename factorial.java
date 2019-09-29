package IntroPackage;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        int number,answer;
        System.out.println("Please, type a number: ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        answer = factorial(number);
        System.out.println(answer);
    }
        public static int factorial(int n)
        {
            if (n==0){
                return 1;
            }
            else
                return n*factorial(n-1);
        }

}
