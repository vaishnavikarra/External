public class TestFactorial {
    public static void main(String[] args) {
        try {
            if (Factorial.compute(5) != 120) {
                throw new AssertionError("Test failed for 5");
            }
            if (Factorial.compute(3) != 6) {
                throw new AssertionError("Test failed for 3");
            }
            System.out.println("All test cases passed!");
        } catch (AssertionError e) {
            System.out.println( e.getMessage());
            System.exit(1);  
        } catch (Exception e) {
            System.out.println( e.getMessage());
            System.exit(1);
        }
    }
}
