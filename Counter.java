public class Counter {
    // Static variable to keep track of the number of instances
    private static int count = 0;
    
    // Final variable to represent the maximum number of instances
    private static final int MAX_COUNT = 5;

    // Constructor
    public Counter() {
        // Increment count only if it hasn't reached MAX_COUNT
        if (count < MAX_COUNT) {
            count++;
        } else {
            System.out.println("Cannot create more than " + MAX_COUNT + " instances.");
        }
    }

    // Static method to get the current count
    public static int getCount() {
        return count;
    }

    // Final method to display the count and max count
    public final void displayCount() {
        System.out.println("Current count of instances: " + count);
        System.out.println("Maximum count allowed: " + MAX_COUNT);
    }

    public static void main(String[] args) {
        // Creating multiple instances of Counter
        Counter c1 = new Counter();// This one should display a message about the limit

        // Display the count of instances
        System.out.println("Total instances created: " + Counter.getCount());

        // Attempt to display the count and max count
        c1.displayCount();

        // Uncommenting the line below will cause a compilation error, as MAX_COUNT is final
        // MAX_COUNT = 10; 
    }
}
