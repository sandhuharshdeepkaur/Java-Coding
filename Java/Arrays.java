/* What is Array?

- Array is a List of Elements of the same type placed in Contiguous memory Location. */


// Creating an array

//dataType arrayName[] = new dataType [Size]

package Java;

import java.util.*;

// Program to print Input Array 
public class Arrays{

    public static void markarrays(){

        int marks[] = new int [50];

        try(Scanner sc = new Scanner(System.in)){

            marks [0] = sc.nextInt();
            marks [1] = sc.nextInt();
            marks [2] = sc.nextInt();

            System.out.println("Marks of phy, chem, math are:" + marks[0]+" "+ marks[1]+ " "+ marks[2]);
        }
        }

    // Program to print Updated Arrays

        public static void update(int marks[]){
            
            for (int i = 0; i < marks.length; i++){
                marks[i] = marks[i]+1;
            }
        }


        public static void main(String args[]){
            //markarrays();

            int marks[] = {99, 98, 86, 13};
            update(marks);

            for(int i = 0; i<marks.length; i++){
            System.out.println("Updated marks:" + marks[i]+" ");
            }
            System.out.println();
        }
    }




