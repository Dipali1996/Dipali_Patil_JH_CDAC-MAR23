/*Date and Time Converter
Accept date and time from user. You are required to write a Java program to convert 
dates and times between different formats.
The program should be able to convert dates between the following formats:
a. dd/mm/yyyy (e.g., 31/12/2022)
b. mm/dd/yyyy (e.g., 12/31/2022)
c. yyyy/mm/dd (e.g., 2022/12/31)
The program should be able to convert times between the following formats:
a. hh:mm:ss (e.g., 23:59:59)
b. hh:mm:ss a (e.g., 11:59:59 PM)
c. hh:mm (e.g., 23:59)
The program should be able to convert dates and times between the following 
formats:
a. dd/mm/yyyy hh:mm:ss (e.g., 31/12/2022 23:59:59)
b. mm/dd/yyyy hh:mm:ss a (e.g., 12/31/2022 11:59:59 PM)
c. yyyy/mm/dd hh:mm (e.g., 2022/12/31 23:59)*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateDemo {
	public static void main(String[] args) {
		// Accept date and time from user input
        String input = "31/12/1997 23:59:59";
        
        // Convert date and time formats
        String output1 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String output2 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        String output3 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String output4 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String output5 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
        String output6 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("HH:mm"));
        String output7 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String output8 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a"));
        String output9 = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")).format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        
        
        System.out.println("Input: " + input);
        System.out.println("dd/MM/yyyy : " + output1);
        System.out.println("MM/dd/yyyy : " + output2);
        System.out.println("yyyy/MM/dd : " + output3);
        System.out.println("HH:mm:ss : " + output4);
        System.out.println("hh:mm:ss a : " + output5);
        System.out.println("HH:mm : " + output6);;
        System.out.println("dd/MM/yyyy HH:mm:ss: " + output7);;
        System.out.println("MM/dd/yyyy hh:mm:ss a " + output8);;
        System.out.println("yyyy/MM/dd HH:mm : " + output9);;
	}
}
