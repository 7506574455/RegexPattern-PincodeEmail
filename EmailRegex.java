package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
            //class created
public class EmailRegex {
                 //main method
     public static void main(String[] args) {
			String email = "abc.xyz@bridgelabz.com.in";
			
	        String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)@[a-zA-Z]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})$";

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			boolean result = matcher.matches();
			if(result)
	           System.out.println("Valid Email");
			else
				System.out.println("InValid Email");
     }	
}