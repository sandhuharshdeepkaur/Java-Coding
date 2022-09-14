package Java;

import java.net.SocketTimeoutException;

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



        public static void pattern2(int n){
            for(int i = 1; i <= n; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(j);
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

        public static void traingle01(int n){

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    if((i+j) % 2 == 0 ){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }

    public static void main(String args[]){
    
        numpy(9);

        palinpattern(8);

        hollotriangle(5);

        pattern2(5);

        pa(5);

        patte(4);

        traingle01(5);
}
}
