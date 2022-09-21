package Java;

public class butterfly {

    // Program to print Butterfly pattern 

    public static void butterflypattern(int n){

        for (int i = 1; i <= n; i++){                       // 1st Half
            
            for (int j = 1; j <= i; j++){                  // Stars
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++){          // Spaces
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){                // Stars
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--){                  // 2nd Half
            
            for(int j = 1; j <= i; j++){               // Stars
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++){       // Spaces
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){               // Stars
                System.out.print("*"); 
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        butterflypattern(25);                           // Input

    }
}
