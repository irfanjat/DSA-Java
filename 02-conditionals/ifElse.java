import java.util.*;
public class ifElse {
    public static void main(String[] args) {
        // int number = 10;

        // if (number > 0) {
        //     System.out.println("The number is positive.");
        // } else if (number < 0) {
        //     System.out.println("The number is negative.");
        // } else {
        //     System.out.println("The number is zero.");
        // }

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer :");
        int num = in.nextInt();

        if ((num & 1) ==0 ){
            System.out.println("Then "+num + "is even");
        
        }else{
            System.out.println("The " +num+ "is odd.");
        }

    }
}