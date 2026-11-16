public class swapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Step 1: Combine both values into 'a' (a becomes 30)
        a = a + b; 
        
        // Step 2: Subtract original 'b' from the sum to get original 'a' (b becomes 10)
        b = a - b; 
        
        // Step 3: Subtract new 'b' from the sum to get original 'b' (a becomes 20)
        a = a - b; 

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
