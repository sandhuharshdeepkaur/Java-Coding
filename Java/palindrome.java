package Java;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class palindrome {


    public static void palindro(int num){
        

            int temp, rev = 0, Ld;
            
            temp = num;
            while(num != 0 ){
                Ld = num % 10;
                rev = (rev*10)+Ld;
                num /= 10;
            }

            if(temp == rev){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a palindrome");
            }
        }
    

    public static void main(String args[]){
        palindro(86);
        
    }
    
}
