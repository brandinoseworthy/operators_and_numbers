public class Main {
    public static void main(String[] args) {

        exer3();


    } // end method

    public static void exer1 () {
        //Write the following integers in binary notation. Do not use any Java functions or online conversion application
        // to calculate the answer as this will hinder the learning process and your understanding of the concept. However, you may check your answers using Java methods.
        //1
        //8
        //33
        //78
        //787
        //33,987
    }

    public static void exer2() {
//        Convert the following binary numbers to decimal notation. Do not use any Java functions or online conversion applications to calculate the answer as this will hinder the learning process and your understanding of the concept. However, you may check your answers using Java methods.
//        0010
//        1001
//        0011 0100
//        0111 0010
//        0010 0001 1111
//        0010 1100 0110 0111
    }

    public static void exer3 () {
//        Write a program that declares an integer a variable x and assigns the value 2 to it and prints out the binary string version of the number
//        ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results,
//        write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
//                Do the preceding exercise with the following values:
//
//        9
//        17
//        88

    int x = 2;
        System.out.println(Integer.toBinaryString(x)); // 10

        x = x << 1;

        System.out.println(x); // 4

        System.out.println(Integer.toBinaryString(x)); //100

        ////

        int a = 9;
        System.out.println(Integer.toBinaryString(a)); // 1001

        a = a << 1;

        System.out.println(a); //18

        System.out.println(Integer.toBinaryString(a)); //10010

        ////

        int b = 17;
        System.out.println(Integer.toBinaryString(b)); // 10001

        b = b << 1;

        System.out.println(b); //34

        System.out.println(Integer.toBinaryString(b)); //100010
        ////

        int c= 88;
        System.out.println(Integer.toBinaryString(c)); // 1011000

       c = c << 1;

        System.out.println(c); //176

        System.out.println(Integer.toBinaryString(c)); //10110000





    }
} // end class


