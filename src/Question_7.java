public class Question_7 {

    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // throw NullPointerException

            int result = 10 / 0; // throw ArithmeticException
            System.out.println(result);

        } catch (ArithmeticException | NullPointerException e) {
            // Handling both ArithmeticException and NullPointerException in one block
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finally block is executed.");
        }
    }
}
