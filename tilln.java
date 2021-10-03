import java.util.Scanner;

public class tilln {
    public static void main(String[] args) {
        int i, num;
        System.out.println("enter a number\n");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

}
