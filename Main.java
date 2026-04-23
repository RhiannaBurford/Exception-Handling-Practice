public class Main {
    public static void main(String[] args) {
        // 1. Create the object
        DataProcessor processor = new DataProcessor();

        // 2. Print a header so we know what we are looking at
        System.out.println("--- Starting Batch Process ---");

        // 3. Call the method that contains the loop
        processor.runBatch();

        System.out.println("--- Batch Process Complete ---");
    }
}