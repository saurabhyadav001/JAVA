class apnacollege {
    public static void main(String[] args) {

        /*
         * Primitive types byte age= 50; //byte data type can store 1 & 2 digits no
         * only. int phone= 1234567890;//here int phone variable can store upto 10digits
         * only. long phone2= 1234567890142L; //we can use L so that java can understand
         * that we are stoirng a long number not an inter only. float pi= 3.14F; char
         * letter = '@'; boolean isAdult= false;
         */

        // * NON-primitive types : we use to declare this with new keyword

        String name = "Saurabh";
        // String name2 = name.replace('S', 'G'); // using name.replace fun we can
        // replace any word
        {
            // Length
            // System.out.println(name.length()); /* lentgh fundtion is used to print the
            // length of the string. */

            // CharAt()
            // System.out.println(name.charAt(1)); //using charat function we can find the
            // position of the character in the string.
            {
                // System.out.println(name2);
                // System.out.println(name); // In java strings are immutabele means once
                // created then you cna not change it.

                // SUBSTRING
                System.out.println(name.substring(0, 7)); // using substring we can print the desired part of the string
                                                          // only!
                System.out.println(name.substring(4, 7));

            }
        }

        // String CONCATINATION; means adding more than one strings together.
        // String name1 = "saurabh";
        // String name2 = " yadav ";
        // String name3 = name1 + " and" + name2;
        // {
        // System.out.println(name3);
        // }

    }
}