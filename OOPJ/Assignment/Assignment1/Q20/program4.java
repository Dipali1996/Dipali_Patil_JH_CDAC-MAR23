
/*d. Long value into binary, octal and hexadecimal 
string*/

class program4{
    public static void main(String[] args) {
            Long d = 12445;
        System.out.println("Binary : "+Long.toBinaryString(d));
        System.out.println("Octal : "+Long.toOctalString(d));
        System.out.println("Hexadecimal : "+Long.toHexString(d));

    }
}

