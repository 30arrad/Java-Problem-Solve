// Counter.java
public class Counter {
    // Static variable count keeps track of the number of instances created
    private static int count = 0;

    // Final variable MAX_COUNT represents the maximum allowed instances
    private static final int MAX_COUNT = 5;

    // Constructor increments count each time a new instance is created
    public Counter() {
        if (count < MAX_COUNT) {
            count++;
        } else {
            System.out.println("Maximum instance count reached. Cannot create more instances.");
        }
    }

    // Static method that returns the current value of count
    public static int getCount() {
        return count;
    }

    // Final method to display the current count and maximum count
    public final void displayCount() {
        System.out.println("Current count of instances: " + count);
        System.out.println("Maximum count allowed: " + MAX_COUNT);
    }

    public static void main(String[] args) {
        // Creating multiple instances of Counter to test static count and final MAX_COUNT
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        Counter c6 = new Counter();  // This instance should trigger the max count message

        // Display the count using the static method
        System.out.println("Total instances created (count): " + Counter.getCount());

        // Attempt to modify MAX_COUNT (this will cause a compile-time error)
        // MAX_COUNT = 10;  // Uncommenting this line will cause a compilation error

        // Display count and max count using the final method
        c1.displayCount();
    }
}
