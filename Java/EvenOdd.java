package Java;

import java.util.Scanner;

// Program to check if number is Even or Odd with functions 

public class EvenOdd{

    public static boolean isEven(int n){
        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter an Integer:");
            int num = sc.nextInt();

            if(isEven(num)){
                System.out.println("Number is Even.");
            }else{
                System.out.println("Number is Odd.");
            }
        
        
        }

    }

}