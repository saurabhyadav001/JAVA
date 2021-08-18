import java.util.Arrays;

// import jdk.javadoc.internal.doclets.toolkit.builders.PackageSummaryBuilder;

/*class apnaArray {
    public static void main(String[] args)
    // Arrays are non primitive datatypes.
    {
        int[] marks = new int[4]; // here we have declared an array named marks.

        marks[0] = 68; // if we do not assigns/declares any values or marks then by
        // default it will print 0 or NULL.
        marks[1] = 70;
        marks[2] = 50;
        marks[3] = 72;
        // System.out.println(marks[1] + " and " + marks[2]);

        // Length
        // System.out.println(marks.length); // .length function will gives the size of
        // array.

        // Short; it orints in assending order.
        Arrays.sort(marks);
        System.out.print(marks[0]);
    }
}
*/

/*Arrays

class apnaArray {
    public static void main(String[] args) {
        int[] marks = { 50, 60, 70 };
        int[][] marks1 = { { 90, 91, 92 }, { 93, 94, 95 } };  //2D-array.
        System.out.println(marks1[1][2]);
        System.out.println(marks[0]);
    }
}
*/

// class apnaArray {
//     public static void main(String[] args) {
//         // int[] marks = { 50, 55, 50 };
//         // System.out.println(marks[1]);
//         int[][] finalmarks = { { 60, 70, 90 }, { 70, 80, 99 } };  //2D arrays
//         System.out.println(finalmarks[0][1]);

//     }
// }

//CASTING ; means ek type se dusre type me convert karna It is of two types:
//1- IMPLISITE
//2-Explicite
// Ex,. Glass and bucket

class apnaArray {
    public static void main(String[] args) {
        // double price = 100.0;
        // double finalPrice = price + 18;

        // System.out.println(finalPrice);

        // Explicit CASTING.
        // int price1 = 100.0;
        /*
         * here int can't store a double type value in because size of INT is 4 byte and
         * size of double is 8 bytes. So here we can loose some informations so JAVA do
         * not allows it!
         */
        // int price2 = price1 + 10;
        // System.out.println(price2);

        // IMPLICIT CASTING; Here we can store an int values in doubele because size of
        // doubel is more than INT type. Here information can be lost!
        // int price3 = 100;
        // double price4 = price3 + (int) 18.99;
        // System.out.println(price4);

        // Constrants

        // FINAL CONSTRAINT:
        // final float PI = 3.14F;
        // PI = 1.12F; // Here we cant change the value of final variables
        // System.out.println(PI);
    }
}