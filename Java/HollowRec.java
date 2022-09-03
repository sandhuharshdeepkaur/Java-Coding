package Java;


// Program to Print Hollow Rectangle

public class HollowRec{

    public static void main(String args[]){                                            // Main Function
        Hollow_Rec(4,5);                                         // Calling the Method with input
    }
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
} 