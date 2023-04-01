/**Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double.
 */
 import java.util.*;
class Q30{
    public static void main(String []args){
        Scanner In = new Scanner(System.in);
        System.out.println("Enter First value : ");
        double num1 = In.nextDouble();
        System.out.println("Enter Second value : ");
        double num2 = In.nextDouble();
        double sum =0l;
        System.out.println("Maximum Value : "+Double.max(num1,num2));
        System.out.println("Minimum value : "+Double.min(num1,num2));
        System.out.println("Sum of values : "+Double.sum(num1,num2));
    }
}