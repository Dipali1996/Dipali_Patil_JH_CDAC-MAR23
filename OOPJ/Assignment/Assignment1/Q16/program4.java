
/*d. int value into binary, octal and hexadecimal 
string*/

class program4{
    public static void main(String[] args) {
            int d = 1245;
        System.out.println("Binary : "+Integer.toBinaryString(d));
        System.out.println("Octal : "+Integer.toOctalString(d));
        System.out.println("Hexadecimal : "+Integer.toHexString(d));

    }
}

