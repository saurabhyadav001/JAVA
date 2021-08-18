// import java.time.Year;
// import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.resources.standard;

// class test {
// public static void main(String args[]) {
// int a = 5, b = 2; // graeter number amont two numbers
// if (a > b) {
// System.out.println("a");
// } else {
// System.out.println("b");
// }
// }
// }

// class test {
// public static void main(String args[]) { //grater number among three numbers
// int a = 556, b = 137, c = 8;
// if (a > b && a > c) {
// System.out.println("a is grater");
// } else if (b > a && b > c) {
// System.out.println("b is greater");
// } else {
// System.out.println("c is grater");
// }
// }
// }

// class test {
// public static void main(String args[]) {
// int a, b;
// Scanner n = new Scanner(System.in);
// System.out.println("enter two numbers");
// a = n.nextInt();
// b = n.nextInt();
// if (a > b) {
// System.out.println("a is great");
// } else {
// System.out.println("b is great");
// }
// }
// }

// class test {
// public static void main(String args[]) {
// int a, b, c;
// Scanner x = new Scanner(System.in);
// System.out.println(" enter three values at random");
// a = x.nextInt();
// b = x.nextInt();
// c = x.nextInt();
// if (a > b && a > c) {
// System.out.println("a is great");
// } else if (b > a && b > c) {
// System.out.println("b is great");
// } else {
// System.out.println("c is great");
// }
// }
// }

// class test {
// public static void main(String arga[]) {
// int i = 19;
// if (i % 2 == 0) {
// System.out.println("even number"); // EVEN ODD PROGRAMS
// } else {
// System.out.println("odd");
// }
// }
// }

// class test {
// public static void main(String args[]) {
// int a;
// Scanner n = new Scanner(System.in);
// System.out.println("enter a number");
// a = n.nextInt();
// if (a % 2 == 0) {
// System.out.println("even");
// } else {
// System.out.println("odd");
// }

// }
// }

// class test {
// public static void main(String args[]) {
// int a, b, c;
// Scanner x = new Scanner(System.in);
// System.out.println("enter a");
// a = x.newInt();
// System.out.println("enter b"); // need to work
// b = x.newInt();
// System.out.println("enter c");
// c = x.newInt();
// System.out.println("sum is" + (a + b + c));

// }
// }

// class test {
// public static void main(String args[]) {
// int year = 2016;
// if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) { // leap year
// concep
// System.out.println("it is leeep year");
// } else {
// System.out.println("not a leep year");
// }
// }
// }

// class test {
// public static void main(String args[]) { // swapping of two numebers
// int a = 8, b = 9, c;
// c = a;
// a = b;
// b = c;
// System.out.println("swap of the numbers is" + a);
// System.out.println("swap of the numbers is" + b);

// }
// }

// class test {
// public static void main(String args[])
// {
// int a=25,b=15;
// // Scanner x= new Scanner(System.in);
// System.out.println("select symbol(+,-,*,/"); // calculator need to work
// String sym= "+"; "-" ; "*" ; "/";
// int res;
// switch(sym)
// {
// case "+": res=a+b;
// System.out.println(res);
// break;
// case "-": res=a-b;
// System.out.println(res);
// break;
// case"*": res= a*b;
// System.out.println(res);
// break;
// case"/": res= a/b;
// System.out.println(res);
// break;
// }
// }
// }
// class test {
// public static void main(String args[]) {
// int a = 5432, rem, rev = 0;
// while (a != 0) {
// rem = a % 10;
// rev = rev * 10 + rem;
// a = a / 10;
// }
// System.out.println(rev);
// }
// }

// class Test {
// public static void main(String args[]) { // reverse of an number
// int a = 1235, rem, rev = 0;
// while (a != 0) {
// rem = a % 10;
// rev = rev * 10 + rem;
// a = a / 10;
// }
// {
// System.out.println(rev);
// }
// }
// }

// class test {
// public static void main(String args[]) { // wap to find factorial
// int a = 5, facto = 1;
// for (int i = 1; i <= a; i++) {
// facto = facto * i;
// }
// System.out.println(facto);
// }
// }

// class test {
// public static void main(String args[]) {
// String name = "saurabh";
// int leng = name.length();
// String rev = "";
// for (int i = leng - 1; i >= 0; i--) { //reverse of an string
// rev = rev + name.charAt(i);
// }
// System.out.println(rev);
// }
// }

// class test {
// public static void main(String agrs[]) {
// int i = 2;
// if (i % i == 0 || i % 1 == 0 && i % 2 != 0) { // needs to work
// System.out.println("prime number");
// } else {
// System.out.println("not a prime number");
// }
// }
// }
