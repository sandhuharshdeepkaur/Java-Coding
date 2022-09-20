package Java;

// Program to check if a number is palindrome or not

import java.util.Scanner;

public class palindrome {


    public static boolean ispalindrome(int n){

        int palindrome = n;
        int rev = 0;
        int remainder;

            while(palindrome != 0 ){
                remainder = palindrome % 10;
                rev = (rev*10) + remainder;
                palindrome /= 10;
            }

            if(n == rev){
                return true;
            }
            return false;
        }
    

    public static void main(String args[]){

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number to check it is palindrome or not :");
            int num = sc.nextInt();

            if (ispalindrome(num)){
                System.out.println(num + " is Palindrome number.");
            }else{
                System.out.println(num + " is Not Palindrome number.");
            }
        }
    }
}
