package IntroPackage;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        int number;
        System.out.println("please type a number : ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        boolean answer = IsPrime(number);
        if ( answer == false)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }

    public static boolean IsPrime(int n) {

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

