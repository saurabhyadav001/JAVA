import java.util.Scanner;

class program {
    public static void main(String[] args) {
        int j;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the numbers");
            j = sc.nextInt();
            System.out.println("you entered " + j);
        } while (j >= 0);
        System.out.println("THE END");

        // int number;
        // Scanner sc = new Scanner(System.in);
        // do {
        // System.out.println("Input a number");
        // number = sc.nextInt();
        // System.out.println("here is your number :" + number);
        // // System.out.println(number);
        // } while (number >= 0);
        // System.out.println("THE END");
    }
}
