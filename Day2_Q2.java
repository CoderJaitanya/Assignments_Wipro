class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Day2_Q2 {
    public static void main(String[] args) {
        try {
            checkValue(-5);
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after CustomException handling.");
        }
    }

    public static void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative: " + value);
        } else {
            System.out.println("Valid value: " + value);
        }
    }
}