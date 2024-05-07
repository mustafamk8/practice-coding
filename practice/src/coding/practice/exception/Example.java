package coding.practice.exception;



public class Example {
	
	public class CustomException extends Exception {
	    public CustomException(String message) {
	        super(message);
	    }
	}
	
    public void performOperation(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative");
        }
    }

    public static void main(String[] args) {
        Example example = new Example();
        try {
            example.performOperation(-1);
            System.out.println("Operation performed successfully.");
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

