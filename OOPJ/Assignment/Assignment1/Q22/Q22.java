/** Write a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long.
*/

import java.util.*;
class Q22{
    public static void main(String []args){
        Scanner In = new Scanner(System.in);
        System.out.println("Enter First value : ");
        long num1 = In.nextLong();
        System.out.println("Enter Second value : ");
        long num2 = In.nextLong();
        long sum =0l;
        System.out.println("Maximum Value : "+Long.max(num1,num2));
        System.out.println("Minimum value : "+Long.min(num1,num2));
        System.out.println("Sum of values : "+Long.sum(num1,num2));
    }
}