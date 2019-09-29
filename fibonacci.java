package IntroPackage;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int number,answer;
        System.out.println("please type a number for fibonacci");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        answer = fibonacci(number);
        System.out.println("fibonacci of" + " "+ number +" " +"is"+ " "+ answer);
    }

    public static int fibonacci(int n)
    {
        if ( n==0 || n==1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
