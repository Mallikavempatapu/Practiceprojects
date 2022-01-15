package PracticeProject.program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfEmailId {
	public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }

	   public static void main(String[] args) throws IOException {
	       List<String> emails = new ArrayList<String>();
	       // valid email addresses
	       emails.add("surya@example.com");
	       emails.add("abhishek@example.com");
	       emails.add("priya@example.me.org");
	       //invalid email addresses
	       emails.add("aman.example.com");
	       emails.add("ramu.bob..@example.com");
	       emails.add("akhila@.example.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid\n" : "invalid\n"));
	       }
	       
	       System.out.println("Enter any email address to check: ");
	       System.in.read();
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	   }

}
