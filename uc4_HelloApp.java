public class uc4_HelloApp{

    public static void main(String[] args) {

        // If no arguments provided
        if (args.length == 0) {
            System.out.println("Hello World");
        } 
        else {
            // Loop through all provided names
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }

    }
}