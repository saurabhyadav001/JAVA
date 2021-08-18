import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

class salary {
    public static void main(String[] args) {
        int s;
        {
            System.out.println("enter the salary");
        }
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        if (s <= 10000) {
            System.out.println(s + 1000);
        } else {
            System.out.println(s + 2000);
        }
        if (s < 0) {
            System.out.println("not valid");
        }
    }
}

// import java.util.Scanner;

// class table {
// public static void main(String[] args) {

// for (int i = 0; i <= 10; i += 2) {
// System.out.println(i);
// }
// }
// }

// class table {
// public static void main(String[] args) {
// int n, m;
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number");
// n = sc.nextInt();
// for (m = 1; m <= n; m++) {
// System.out.print(m);
// }
// }
// }