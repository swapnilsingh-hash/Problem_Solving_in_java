public class Day11_1 {

    public static void BinTodec(int BinNum){
        int MyNum=BinNum;
        int pow=0;
        int decNum=0;

        while(BinNum > 0){
            int lastDigit= BinNum % 10;
            decNum= decNum+ (lastDigit * (int)Math.pow(2,pow));

            pow++;
            BinNum = BinNum/10;

        }
        System.out.println("Decimal of "+ " "+MyNum +" =" + decNum);
    }

    public static void main(String args[]){

        BinTodec(101);




    }
    
}
