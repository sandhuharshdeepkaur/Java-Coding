/* What is Array?

- Array is a List of Elements of the same type placed in Contiguous memory Location. */


// Creating an array

//dataType arrayName[] = new dataType [Size]

package Java;

import java.util.*;

public class Arrays{

    // Program to print Input Array 

    public static void markarrays(){

        int marks[] = new int [50];

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter marks of Physics, Chemistry, Mathematics : ");
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
            System.out.println("Updated marks of subjects are:" + marks[0] + " "+ marks[1] +" "+ marks[2]);
        }

        //Program to print Larget and Smallest values of the array

        public static int getLargest (int numbers []){

            int Largest = Integer.MIN_VALUE;
            int Smallest = Integer.MAX_VALUE;

            for(int i = 0; i < numbers.length; i++){
                if (Largest < numbers[i]){
                    Largest = numbers[i];
                }
                if(Smallest > numbers[i]){
                    Smallest = numbers[i];
                }
            }
            System.out.println("Smallest value of array is: " + Smallest);
            return Largest;
        }


        public static void main(String args[]){

            markarrays();

            int marks[] = {99, 98, 86};
            update(marks);

            int numbers[] = {1,2,3,3,54};
            System.out.println("Largest value of the array is: "+ getLargest(numbers));
        }
    }




