import java.util.Scanner;

// import jdk.internal.reflect.CallerSensitive;

public class apnaswitchcase {
    public static void main(String[] args) {
        // int Day;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // Day = sc.nextInt();
        // switch (Day) {
        // case 1: {
        // System.out.println("Monday");
        // break;
        // }
        // case 2: {
        // System.out.println("Tuesday");
        // break;
        // }
        // case 3: {
        // System.out.println("wednesday");
        // break;
        // }
        // case 4: {
        // System.out.println("Thursday");
        // break;
        // }
        // case 5: {
        // System.out.println("friday");
        // break;
        // }
        // case 6: {
        // System.out.println("saturday");
        // break;
        // }
        // case 7: {
        // System.out.println("sunday");
        // break;
        // }
        // default: {
        // System.out.println("ERROR");
        // }
        // }

        // LOOPS;
        // for(int i=1; i<=10; i++)
        // for (int i = 100; i >= 1; i--) {

        // System.out.println(i);
        // }

        // While LOOP; here loop will execute according to the condition,,in while loop
        // we firstly check condition then runs the program.
        // int i = 1;
        // while (i <= 10) {
        // System.out.println(i);
        // i = i + 1;
        // }

        // DO-WHILE LOOP; in this code executes firstly
        // int k = 1;
        // do {
        // System.out.println(k);
        // k = k + 1;
        // } while (k <= 10);

        // QUES of DO-WHILE lOOP;
        // int j;
        // do {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the numbers");
        // j = sc.nextInt();
        // System.out.println("you entered " + j);
        // } while (j >= 0);
        // System.out.println("THE END");

        // INFINITE WHILE LOOP; BREAK & CONTINUE:
        // int i = 0;
        // while (true) {
        // if (i == 5) {
        // i = i + 1;
        // continue;
        // }
        // System.out.println(i);
        // i = i + 1;
        // if (i > 15) {
        // break;
        // }
        // }

        int i;
        int mynumber=45;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Guess the number");
            i= sc.nextInt();
            if(i==mynumber){
                System.out.println("Excellent work");
                break;
            }
            else if(i> mynumber){
                System.out.println("TOO HIGH");
            }

            else {
                System.out.println("TOO LESS");    
            }
            while(i>=0);

            System.out.println("my number was"+ mynumber);
    }
}
