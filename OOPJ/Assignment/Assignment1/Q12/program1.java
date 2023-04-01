//a. The number of bits used to represent a short value */
class program1
{
    public static void main(String[] args) {
        short s = 1;
        int a = Short.SIZE;
        System.out.println((int)(a*s)); 
    }
}
