public class TestFactorial {
    public static void main(String[] args) {
        try {
            if (Factorial.compute(5) != 120) {
                throw new AssertionError("Test failed for 5");
            }
            if (Factorial.compute(0) != 1) {
                throw new AssertionError("Test failed for 0");
            }

            System.out.println("Test cases passed successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
