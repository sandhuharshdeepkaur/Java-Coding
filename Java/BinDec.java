package Java;

public class BinDec {

    // Program to print conversion of Binary number to Decimal number

    public static void BintoDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;

        while(binNum>0){
            int Ld = binNum % 10;
            dec = dec + (Ld * (int)Math.pow(2, pow));
            pow++;
            binNum /= 10; 
        }
        System.out.println("Decimal number of "+ myNum + " = " + dec);
    }
    
    public static void main(String args[]){
        BintoDec(1001);
    }
}
