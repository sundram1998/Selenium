package arrayStrings;
public class DigitSum {

    public static void main(String[] args) {
        int number = 123456888  ;
        int result = addDigitsUntilSingleDigit(number);

        System.out.println("The result is: " + result);
    }

    public static int addDigitsUntilSingleDigit(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
