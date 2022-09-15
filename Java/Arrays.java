/* What is Array?

- Array is a List of Elements of the same type placed in Contiguous memory Location. */


// Creating an array

//dataType arrayName[] = new dataType [Size]

package Java;

import java.util.*;

public class Arrays{

    public static void main(String args[]){

        int marks[] = new int [50];

        try(Scanner sc = new Scanner(System.in)){

            marks [0] = sc.nextInt();
            marks [1] = sc.nextInt();
            marks [2] = sc.nextInt();

            System.out.println("Marks of phy, chem, math are:" + marks[0]+" "+ marks[1]+ " "+ marks[2]);
        }
        }
    }




