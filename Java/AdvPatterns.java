package Java;

import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class AdvPatterns {

    // Program to print Pyramid numbers

    public static void numpy(int n){

        for (int i = 1; i <= n; i++){                       // Lines
            for(int j = 1; j <= (n-i); j++){               // Spaces
                System.out.print(" ");
            }
    
            for(int j = 1; j <= i; j++){                 // Numbers
                System.out.print(i  + " ");
            }
            System.out.println();
        }
    }


    // Program to print palindromic pattern with numbers

    public static void palinpattern(int n){

        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= n-i; j++){                     // For Spaces
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--){                       // For Descending
                System.out.print(j);
            }
            
            for(int j = 2; j <= i; j++){                      // For Ascending
                System.out.print(j);
            }

            System.out.println();
        }
    }


    public static void hollotriangle(){

        try(Scanner sc = new Scanner (System.in)){

            System.out.println("Enter row number of a triangle :");
            
            int n = sc.nextInt();

        for (int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                if (j == 1 || i == j || i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

        public static void pattern1(int n){
            int counter = 5;
            for(int i = 1; i <= n; i++){
                for (int j = 1; j <= (n-i)+1; j++){
                    System.out.print(counter+ " ");
                    counter--;
                }
                System.out.println();
            }
        }

        public static void pattern2(int n){
            for(int i = 1; i <= n; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        public static void pa(int n){
            for(int i = 1; i <= n; i++){
                for (int j = 1; j < i; j++){
                    System.out.print(" ");
                }
                for (int j = n; j >= i; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void patte(){
            int n = 4;
            for (int i = 1; i<= n; i++){
                for(int j = n; j > i; j--){
                    System.out.print(" ");
                    }
                for (int j = 1; j <= (i*2)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    public static void main(String args[]){
    
        numpy(9);

        palinpattern(8);

        hollotriangle();

        pattern1(5);

        pattern2(5);

        pa(5);

        patte();
}
}
