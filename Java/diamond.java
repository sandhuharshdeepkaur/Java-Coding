package Java;

// Program to print diamond pattern of stars

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

    public static void main(String args[]){

        numpy(9);

        diamondi(7);
    }
}