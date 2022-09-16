package Java;

public class BinDec {

    // Program to print Decimal number of given Binary number

    public static void BintoDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;

        while(binNum>0){
            int Ld = binNum % 10;
            dec = dec + (Ld * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal number of "+ myNum + " = " + dec);
    }

    //Program to print Binary number of given Decimal number
    public static void DectoNum(int n){
        
        int myNum = n;
        int pow = 0, binNum = 0;

        while(n>0){
            int rem = n%2;

            binNum = binNum + (rem * (int) Math.pow(10,pow));
            pow++;
            
            n /= 2;
        }

        System.out.println("Binary number of "+ myNum + " = " + binNum);
    }



    public static void main(String args[]){

        // BintoDec(1001);

        DectoNum(7);

    }
}
