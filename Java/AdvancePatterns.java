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

    // Program to print Rhombus

    public static void rhombus(int n){

        for (int i = 1; i <= n; i++){               //For Lines
            for(int j = 1; j <= n-i; j++){         // For Spaces
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){      // For stars
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    // Program to print Hollow Rhombus pattern

    public static void holloRhmbuso(int n){

        for(int i = 1; i <= n; i++){                                   // Lines

            for(int j = 1; j <= n-i; j++){                           // Spaces
                    System.out.print(" ");
                }

            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

        // Program to print Hollow Triangle Pattern

        public static void hollotriangle(int n ){

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

        public static void patte(int n){
            
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

    
    public static void main(String args[]){                                   // Main Function
        
        Hollow_Rec(4,5);
        
        Holinvpattern(4);                                                 

        rhombus(5);

        holloRhmbuso(5);

        hollotriangle(5);

        pa(5);

        patte(4);
    }
} 