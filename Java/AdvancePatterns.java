package Java;

public class AdvancePatterns{

    // Program to Print Hollow Rectangle

    public static void Hollow_Rec(int TotalRows, int TotalCols){                     // Method to create Hollow Rectangle

        for (int i = 1; i <= TotalRows; i++){                                       // Outer loop for Lines
            
            for (int j = 1; j <= TotalCols; j++){                                  // Inner loop for the Stars
                
                if (i == 1 || i == TotalRows || j == 1 || j == TotalCols){        // Condition for Hollow rectangle
                    System.out.print("*");                                     // Printing the stars
                }else{
                    System.out.print(" ");                                    // Printing hollow space  
                }
            }

            System.out.println();                                              // For Next line
        }
    }


     // Program for Hollow Inverted PyramidPattern


    public static void Holinvpattern(int n){

        for (int i = 1; i <= n; i++){                                      // Outer Loop for lines
            
            for (int j = 1; j <= n-i; j++){                              // Inner Loop for Spaces
            System.out.print(" ");                                   // Printing the Spaces
            }

            for (int j = 1; j <= i; j++){                             // Inner Loop for Stars
            System.out.print("*");                                 // Printing the Stars
            }

            System.out.println();                                   // Next line
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


    
    public static void main(String args[]){                                   // Main Function
        
        Hollow_Rec(4,5);                                // Calling Hollow Rectangle method with input                              // Calling the Method with input
        
        Holinvpattern(4);                                                 // Calling Method with input

        pattern3(5);                                                     // Calling Method with input

        Triangle(5);

        triangle01(5);
    }
} 