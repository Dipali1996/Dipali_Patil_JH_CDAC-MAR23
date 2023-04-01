/** Write a program to convert state of Integer instance into byte, 
short, int. long, float and double.
*/

class program1
{
    public static void main(String args[])
    {
        int d1=123;
        Integer b = new Integer(d1); // instance

        System.out.println("Integer instance"+d1+" conerted value in ");

        byte b1 = b.byteValue();
        System.out.println("byte : "+b1);

        int i = b.intValue();
        System.out.println("nt : "+i);

        
        short s = b.shortValue();
        System.out.println("short : "+s);

        long l = b.longValue();
        System.out.println("long : "+l);

        float f = b.floatValue();
        System.out.println("float : "+f);

        double d = b.doubleValue();
        System.out.println("double : "+d);
    }
}