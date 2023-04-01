/**  Write a program to find minimum and maximum number as well as 
to add two integer numbers using methods of Integer.
*/
import java.util.*;
class program1{
    public static void main(String []args){
        Scanner In = new Scanner(System.in);
        System.out.println("Enter First value : ");
        int num1 = In.nextInt();
        System.out.println("Enter Second value : ");
        int num2 = In.nextInt();
        int sum =0;
        System.out.println("Maximum Value : "+Integer.max(num1,num2));
        System.out.println("Minimum value : "+Integer.min(num1,num2));
        System.out.println("Sum of values : "+Integer.sum(num1,num2));
    }
}