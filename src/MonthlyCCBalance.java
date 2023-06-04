public class MonthlyCCBalance
{
    public static void main(String[] args) {
    double accBalance = 5000;
    final double INTEREST_RATE = 0.17;
    double monthOne = 0;
    double monthTwo = 0;
    monthOne = accBalance * INTEREST_RATE;
        System.out.println("The interest due after one month is:" + " " + "$" + monthOne);
    accBalance = accBalance + monthOne;
    monthTwo = accBalance * INTEREST_RATE;
        System.out.println("The interest due after two months is:" + " " + "$" + monthTwo);



    }
}