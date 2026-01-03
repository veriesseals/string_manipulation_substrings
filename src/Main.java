public class Main {
    public static void main(String[] args) throws Exception {
        
        // create a new String by removing characters from the original String by specifying the start index number. This involves isolating the characters from the start index number to the end of the String. You’ll specify the substring(int startIndexPosition)as in the example below. Review the code and then select Run to view the output.

        // Create a variable of type String and assign it the value "This is a test"
        String testString = "This is a test";

        // Assign the result of calling substring(3) on testString to a new String variable named result1

    	String result1 = testString.substring(3);  //”s is a test”

        // Assign the result of calling substring(12) on testString to a new String variable named result2

    	String result2 = testString.substring(12); // “st”

        // Print the values of result1 and result2 to the console
        System.out.println("testString.substring(3) : " + testString.substring(3));
        System.out.println("testString.substring(12) : " + testString.substring(12));
    }
}
