package Java;

import java.util.Scanner;

public class palindrome {


    public static void palindro(){

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number to check it is palindrome or not :");
            int num = sc.nextInt();

            int temp, rev = 0, Ld;
            
            temp = num;
            while(num != 0 ){
                Ld = num % 10;
                rev = (rev*10)+Ld;
                num /= 10;
            }

            if(temp == rev){
                System.out.println(temp + " is Palindrome number.");
            }else{
                System.out.println(temp +" is Not a palindrome number.");
            }
        }
        }
    

    public static void main(String args[]){
        palindro();
        
    }
    
}
