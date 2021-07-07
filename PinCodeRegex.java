package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {

	public static void main(String[] args) {
		String pinCode = "400086";
		
		String regex="^[0-9]{6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pinCode);
		boolean result = matcher.matches();
		if(result)
           System.out.println("Valid Pincode");
		else
			System.out.println("InValid Pincode");
		
	}
}
