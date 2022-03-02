public class Main {
    public static void main(String[] args) {
        //complete exer1();
        //complete exer3();
        //complete exer4();
        //complete exer5();
        //complete exer6();
        //complete exer7();
        //complete exer8();

    } // end method

    public static void exer1 () {
        //Write the following integers in binary notation. Do not use any Java functions or online conversion application
        // to calculate the answer as this will hinder the learning process and your understanding of the concept. However, you may check your answers using Java methods.
        //1             1
        //8             1000
        //33            100001
        //78            1001110
        //787           1100010011
        //33,987        100001001100011

//            int x = 33987;
//        System.out.println(Integer.toBinaryString(x));
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

    } // end exer3

    public static void exer4() {
//        Write a program that declares a variable x and assigns 150 to it and prints out the binary string version of the number.
//        Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment indicating what you anticipate
//        the decimal and binary values to be. Now print the value of x and the binary string.
//        Do the preceding exercise with the following values:
//
//        225
//        1555
//        32456

        int x = 150;
        System.out.println(Integer.toBinaryString(x)); // 10010110

        x = x>> 2;
        System.out.println(x); //37
        System.out.println(Integer.toBinaryString(x)); //100101

        int a = 255;
        System.out.println(Integer.toBinaryString(a)); // 11111111

        a = a>> 2;
        System.out.println(a); //63
        System.out.println(Integer.toBinaryString(a)); //111111

        int b = 1555;
        System.out.println(Integer.toBinaryString(a)); // 111111

        b = b>> 2;
        System.out.println(b); //388
        System.out.println(Integer.toBinaryString(b)); //110000100


    } //end exer4

    public static void exer5() {
//        Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y. Write a comment that
//        indicates what you predict will be the result of the bitwise & operation on x and y. Now use the bitwise &
//        operator to derive the decimal and binary values and assign the result to z.
//        Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y. As
//        before, write a comment that indicates what you predict the values to be before printing them out.

        int x = 7;
        int y = 17;
        int z = (x & y); // we are going to use a dynamic value for z (x and y)
        System.out.println(z); //1
        System.out.println(Integer.toBinaryString(z)); //1

        z = (x | y);
        System.out.println(z); //23
        System.out.println(Integer.toBinaryString(z)); //10111

    } //end exer5

    public static void exer6() {
        //Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator
        // to increase the value. Print the value before and after the increment operator.

        int x = 124;
        System.out.println(x);
        x++;
        System.out.println(x); // adds one x = 125 now

    }// end exer6

    public static void exer7(){
       // Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times.
        // Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.

        int x = 456;
        System.out.println(x); //456
        x += 1;
        System.out.println(x); //457
        x++;
        System.out.println(x); // 458
        ++x;
        System.out.println(x); //459

    } //end exer7

    public static void exer8(){
//        Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y. Create
//        another variable sum and assign the value of ++x added to y and print the result. Notice the value of the
//        sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. Notice what
//        the value of sum is. The first configuration incremented x and then calculated the sum while the second
//        configuration calculated the sum and then incremented x.

        int x = 5;
        int y = 8;
        System.out.println(x + y); //13

//        int z = ((++x) + y);
//        System.out.println(z); //14

        int z =((x++) + y);
        System.out.println(z); // 13

        System.out.println(x); // x is NOW 6

    }// end exer8

} // end class


