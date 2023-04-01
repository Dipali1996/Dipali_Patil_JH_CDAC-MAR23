/**.Accept character from command line and perform below 
operations. Here you can use charAt() method to extract 
character:
a. Check whether entered character is letter or digit. If it 
is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
If it is in lowercase then convert it into upper case and 
print it well as its code point. If it is in uppercase 
then convert it into lower case and print it well as its 
code point.
 */
class Q11{
    public static void main(String []args){

        System.out.println((args[0])); 
        String s=args[0];
        char c=s.charAt(0);
        int codepoint =s.codePointAt(0);
        System.out.println(c);  
        
        if(Character.isDigit(c)){
        System.out.println("char is didgit"+c); 
        System.out.println("char is didgit"+(int)c); 
        }
        else if(Character.isLetter(c))
        {
            if(Character.isLowerCase(c)){
                System.out.println("Letter is in lower case"); 
                System.out.println("Upper case is:"+Character.toUpperCase(c));
                System.out.println("codepoint :"+codepoint);  
            }
            else{
                System.out.println("Letter is in Upper case"); 
                System.out.println("Lower case is:"+Character.toLowerCase(c));
                System.out.println("codepoint :"+codepoint);
            }
        }
        else{
            System.out.println("char is not a digit");
        }
        
        
}
}