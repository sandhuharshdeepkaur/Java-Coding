package Java;

// Program to print Diamond pattern of stars

public class diamond{

public static void diamondi(int n){


    for (int i =1; i <= n; i++){                         // 1st half

        for (int j = 1; j <= (n-i); j++){               // For spaces
            System.out.print(" ");
        }

        for(int j = 1; j <= (2*i) - 1; j++){           // For stars
            System.out.print("*");
        }
        System.out.println();                         // Next Line
    }

    for (int i = n; i >= 1; i--){                    // 2nd half

        for (int j = 1; j <= (n-i); j++){            // For Spaces
            System.out.print(" "); 
        }

        for (int j = 1; j <= (2*i)- 1; j++){         // For Stars
            System.out.print("*");
        }
        System.out.println();                        // Next Line
    }
}

// Program for printing number pyramid



    public static void main(String args[]){
        diamondi(10);
    }
}