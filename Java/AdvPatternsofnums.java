package Java;

public class AdvPatternsofnums {

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

    // Program to print Number Triangle

        public static void pattern2(int n){
            for(int i = 1; i <= n; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

    // Program to print 0-1 Traingle

    public static void triangle01(int n){                        // Method to print o-1 Triangle

        for (int i = 1; i <= n; i++){                           // Outer loop for lines
            for (int j = 1; j <= i; j++){                      // Inner loop for numbers
                if ((i+j) % 2 == 0){                          // Condition for printing 1
                    System.out.print("1" + " ");             // Printing 1
                }else{
                    System.out.print("0" + " ");           // Printing 2
                }
            }
            System.out.println();                        // Next line
        }
    }

    // Program to print Floyd's Triangle

        public static void Triangle(int n){                         // Method to print Floyd's Triangle
        
        int counter = 1;                                       // Taking variable to print numbers
        for (int i = 1; i <= n; i++){                         // Outer loop for lines             
            for (int j = 1; j <= i; j++ ){                   // Inner loop for numbers
                System.out.print(counter + " ");            // Printing the output
                counter++;                                 // Incrementing the numbers without repeatation
            }
            System.out.println();                         // Next line
        }
    }

    // Program to print Half Pyramid of numbers

        public static void pattern3(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n-i+1; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }


    public static void main(String args[]){
    
        numpy(9);

        palinpattern(8);

        pattern2(5);
        
        triangle01(5);

        Triangle(5);

        pattern3(5);
}
}
