/**Pass integer, float and double value from command line. Parse 
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.  */
import java.util.*;

 class integer{
   static void operation(String n1,String n2){
        System.out.println("Addition of numbers : "+(Integer.parseInt(n1) + Integer.parseInt(n2)));
        System.out.println("Subtraction of numbers : "+(Integer.parseInt(n1) - Integer.parseInt(n2)));
        System.out.println("Multiplication of numbers : "+(Integer.parseInt(n1) * Integer.parseInt(n2)));
        System.out.println("Reminder of numbers : "+(Integer.parseInt(n1) % Integer.parseInt(n2)));
        System.out.println("Division of numbers : "+(Integer.parseInt(n1) / Integer.parseInt(n2)));
    }
}

 class floating{
   static void operation(String n1,String n2){
        System.out.println("Addition of numbers : "+(Float.parseFloat(n1) + Float.parseFloat(n2)));
        System.out.println("Subtraction of numbers : "+(Float.parseFloat(n1) - Float.parseFloat(n2)));
        System.out.println("Multiplication of numbers : "+(Float.parseFloat(n1) * Float.parseFloat(n2)));
        System.out.println("Remember of numbers : "+(Float.parseFloat(n1) % Float.parseFloat(n2)));
        System.out.println("Division of numbers : "+(Float.parseFloat(n1) / Float.parseFloat(n2)));
    }
}

 class double1{
   static void operation(String n1,String n2){
        System.out.println("Addition of numbers : "+(Double.parseDouble(n1) + Double.parseDouble(n2)));
        System.out.println("Subtraction of numbers : "+(Double.parseDouble(n1) - Double.parseDouble(n2)));
        System.out.println("Multiplication of numbers : "+(Double.parseDouble(n1) * Double.parseDouble(n2)));
        System.out.println("Remember of numbers : "+(Double.parseDouble(n1) % Double.parseDouble(n2)));
        System.out.println("Division of numbers : "+(Double.parseDouble(n1) / Double.parseDouble(n2)));
    }
}

class Q33{
    public static void main(String []args){
        String s1 = args[0];
        String s2 = args[1];
        System.out.println("Enter your datatype choice : ");
        System.out.println("1. Integer (Press 1) ");
        System.out.println("2. Float (Press 2) ");
        System.out.println("3. Double (press 3) ");

        Scanner sn = new Scanner(System.in);

        int choice = sn.nextInt();
        
        switch(choice){
            case 1:
                integer.operation(s1,s2);
                break;
            case 2:
                floating.operation(s1,s2);
                break;
            case 3:
                double1.operation(s1,s2);
        }
        
    }
}