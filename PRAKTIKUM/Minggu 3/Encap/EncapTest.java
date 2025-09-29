public class EncapTest {

    /**
     * The main method is the entry point of the program.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String args[]) {
        // Create an instance of the EncapDemo class
        EncapDemo encap = new EncapDemo();

        // Use the public setter methods to set the values of the private variables
        encap.setName("James");
        encap.setAge(35); // This will be capped at 30 by the logic in setAge()

        // Use the public getter methods to retrieve the values and print them
        System.out.println("Name : " + encap.getName());
        // The age will be 30 because the setAge method in EncapDemo has a condition
        System.out.println("Age : " + encap.getAge());
    }
}