import java.util.Scanner;

// class febonassi {
//     public static void main(String[] args) {
//         int a = 0, b = 1;
//         int c;
//         for (int i = 1; i <= 10; i++) {
//             c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;
//         }

//     }
// }

// TAKE INPUT FROM THE USER;
class febonassi {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int c = 0, n;
        System.out.println("enter a number upto which we have to print the febonnasi series values");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (c <= n) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }

}
