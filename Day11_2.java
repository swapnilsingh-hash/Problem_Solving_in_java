public class Day11_2 {

    public static void DecToBin(int DecNum){
        int MyNum = DecNum;
        int pow=0;
        int BinNum=0;

        while(DecNum > 0){
            int rem= DecNum % 2;
            BinNum = BinNum + (rem * (int)Math.pow(10,pow));

            pow++;

            BinNum= BinNum / 2;
        }

        System.out.println("decimal of"+MyNum + " = "+BinNum );

    }

    public static void main(String agrs[]){

        DecToBin(10);


    }
    
}
