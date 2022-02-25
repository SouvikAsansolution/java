/*
This is a program to take input from user and display it.
 */


import java.util.Scanner;
public class Pro1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :-");
        int a=sc.nextInt();
        /*
        sc.nextInt();    // to receive integer value. ex-2,4,5,90
        sc.nextLine();   // to receive string value. ex-"souvik","ram","shiva"
        sc.nextDouble(); // to receive double value. ex-2.345, 5.236,60.32
        sc.nextFloat();  // to receive float value. ex-3.4, 5.2, 7.9
         */

        System.out.println("the result is :-"+a);
    }
}
