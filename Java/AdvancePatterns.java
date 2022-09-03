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

    public static void Triangle(int n){                         // Method to print pattern
        
        int counter = 1;                                       // Taking variable to print numbers
        for (int i = 1; i <= n; i++){                         // Outer loop for lines             
            for (int j = 1; j <= i; j++ ){                   // Inner loop for numbers
                System.out.print(counter + " ");            // Printing the output
                counter++;                                 // Incrementing the numbers without repeatation
            }
            System.out.println();                         // Next line
        }
    }


    
    public static void main(String args[]){                                   // Main Function
        
        //Hollow_Rec(4,5);                                                  // Calling the Method with input
        
        //Holinvpattern(4);

        //pattern3(5);

        Triangle(5);
    }
} 