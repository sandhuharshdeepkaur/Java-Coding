package Java.Java;

// Program to Print Hollow Rectangle

public class HollowRec{

    public static void main(String args[]){
        Hollow_Rec(4,5);
    }
    public static void Hollow_Rec(int TotalRows, int TotalCols){

        for (int i = 1; i <= TotalRows; i++){
            for (int j = 1; j <= TotalCols; j++){
                if (i == 1 || i == TotalRows || j == 1 || j == TotalCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 