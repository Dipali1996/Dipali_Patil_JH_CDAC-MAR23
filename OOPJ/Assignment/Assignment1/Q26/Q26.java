/**Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.
 */

import java.util.*;
class Q26{
    public static void main(String []args){
        Scanner In = new Scanner(System.in);
        System.out.println("Enter First value : ");
        float num1 = In.nextFloat();
        System.out.println("Enter Second value : ");
        float num2 = In.nextFloat();
        float sum =0l;
        System.out.println("Maximum Value : "+Float.max(num1,num2));
        System.out.println("Minimum value : "+Float.min(num1,num2));
        System.out.println("Sum of values : "+Float.sum(num1,num2));
    }
}