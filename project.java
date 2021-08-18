import java.util.Scanner;

class project {
    public static void main(String[] args) {
        int i;
        int mynumber = 45;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number");
            i = sc.nextInt();
            if (i == mynumber) {
                System.out.println("Excellent work");
                break;
            } else if (i > mynumber) {
                System.out.println("TOO HIGH");
            }

            else {
                System.out.println("TOO LESS");
            }
        } while (i >= 0);

        System.out.println("my number was" + mynumber);

    }

}
