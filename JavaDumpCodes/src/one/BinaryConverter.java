package one;

public class BinaryConverter {

    // Method to convert decimal to binary using logic
    private static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder); // Insert remainder at the beginning
            decimalNumber /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 7; // Replace 42 with your desired decimal number

        // Convert decimal to binary using the method
        String binaryRepresentation = decimalToBinary(decimalNumber);

        // Display the result
        System.out.println("Binary representation of " + decimalNumber + ": " + binaryRepresentation);
    }
}

