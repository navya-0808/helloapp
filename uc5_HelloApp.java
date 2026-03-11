public class uc5_HelloApp{

    public static void main(String[] args) {

        // If no arguments provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Enhanced for-each loop
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }

    }
}