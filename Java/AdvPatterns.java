package Java;

public class AdvPatterns {

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
}
}
