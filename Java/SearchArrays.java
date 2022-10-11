package Java;

import java.util.Scanner;

public class SearchArrays {
    
// Program for Linear Search in arrays

public static int LinearSearch(int num[], int key){

    for(int i =0; i < num.length; i++){
        if(num[i] == key){
            return i;
        }
    }
    return -1;
}

public static void main(String args[]){

    try(Scanner sc = new Scanner(System.in)){

        int marks [] = new int [100];
        int key = 10;

        System.out.println("Enter array of 6 numbers:");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        marks[5] = sc.nextInt();
        marks[6] = sc.nextInt();

        int index = LinearSearch(marks, key);

        if(index == -1){
            System.out.println("key Not found.");
        }else{
            System.out.println("key is at Index: " + index);
        }

    }
}

}
