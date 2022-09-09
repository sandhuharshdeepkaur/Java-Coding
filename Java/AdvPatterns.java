package Java;


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



    public static void main(String args[]){
    
        numpy(9);

        palinpattern(8);
}
}
