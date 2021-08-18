import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

// class apnaoperator {
// public static void main(String[] args) {
// OPERATORS: 1-Arithmetic Operator(+, -, *, /, % modulo - to print the
// remainder),
// 2- Assignment Operator, (=)
// 3- Logical operator,
// 4- COmparison Operator

// Unary Operator:
// int num = 2;
// num--;
// num++;
// System.out.println(num);

// Maths: It prints the Maximum\ Minimum valued value between two values.
// System.out.println(Math.max(11, 45));

// System.out.println(Math.min(10, 5));

// RANDOM VALUE; to print the random value
// System.out.println(Math.random());

// int age;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your age");
// float age1 = sc.nextFloat();
// System.out.println("Enter your class");
// int standard = sc.nextInt();
// System.out.println("Your age is " + age1 + " you are in class " + standard);

// Scanner sc = new Scanner(System.in);
// System.out.println("input your name");
// String name = sc.next(); // next will print only the first text.
// // String name = sc.nextLine(); //using nextLine will print entire
// paragraphs.
// System.out.println(name);

// COMPARISON OPERATOR:
// a==b
// a!=b
// a<b ,a>b
// a<=b, a>=b

// boolean issunUp = true;
// if (issunUp == true) {
// System.out.println("Day");
// } else {
// System.out.println("Night");
// }

// LOGICAL OPERATOR:

// int age;
// System.out.println("Enter your age");
// Scanner sc = new Scanner(System.in);
// age = sc.nextInt();
// if (age >= 18 && age <= 60)
// System.out.println("YOu can vote");

// else if (age > 60) {
// System.out.println("You are Senior citizen");
// }

// else
// System.out.println("You can play pubg Mobile");

// pen;10, notebook: 50;

// }
// }

// import java.util.Scanner;

class apnaoperator {
    public static void main(String[] args)

    {
        int cash;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cash");
        cash = sc.nextInt();

        if (cash <= 9)
            System.out.println("You can not buy anything");
        else if (cash >= 10 && cash < 60) {
            System.out.println("You can buy only One thing PEN or Notebook");
        } else {
            System.out.println("You can buy both");
        }
    }

}
