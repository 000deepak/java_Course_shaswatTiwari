public class MathsForDSA {
    public static void main(String[] args) {
            decimalToAnyBase(5,2);
            AnyBaseToDecimal(101,2);
            fastExponentiation(2,3);
            findEvenOdd(7);
            reverseNum(20461);
            power(10,6);
    }
    static void decimalToAnyBase(int decimalNum, int base) {
        int resNum = 0;
        int power = 0;

        while (decimalNum > 0) {
            System.out.println(decimalNum);
            //811 -> 405 -> 202 -> 101 -> 50 & and so on

            int rem = decimalNum % base; // remainder
            System.out.println(rem);
            // 1-> 1 -> 0 -> 1 -> 0 & and so on

            decimalNum /= base; // gives quotient
            System.out.println(decimalNum);
            //405-> 202 -> 101 -> 50 -> 25 & and so on

            resNum += rem * Math.pow(10, power);
            System.out.println("sum  " + resNum);
            // 1-> 11 -> 11 -> 1011 -> 1011  & and so on
            //explaination : initial resNum = 0, rem = 1, power = 0, & 10^0 ==1
            // 1        -> 0 + 1 * 10^0
            // 11       -> 1 + 1 * 10^1
            // 11       -> 11 + 1 * 10^2
            // 1011     -> 11 + 1 * 10^3
            // 1011     -> 1011 + 1 * 10^4
            
            power++;
        }
        System.out.println("Result is "+ resNum);
    }
    static void AnyBaseToDecimal(int binaryNum, int base) {
        int resNum = 0;
        int power = 0;
        while (binaryNum>0){
            int unitDigit = binaryNum %10;
            binaryNum /=10;
            resNum += unitDigit * power(base,power);
            power++;
        }
        System.out.println("Result is "+ resNum);
    }
    static void findEvenOdd(int num){
        if(num%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    static void reverseNum(int num){

        int revNum = 0;
        while (num > 0 ){
            int digit = num %10;
            revNum = revNum*10 + digit;
            num /=10;
        }
        System.out.println("Reverse is: "+ revNum);

    }
    static double power(int num, int power){
        double res = 1;
        for(int i = 0; i< power;i++){
            res = res*num;
        }
        System.out.println(res);
        return res;
    }

    static double fastExponentiation(int num, int power){
        double res = 1;
        while (power > 0){
            if(power %2!=0){
                res = res *num;
            }
            power /= 2;
            num = num *num;
        }
        System.out.println(res);
        return res;
    }


}




