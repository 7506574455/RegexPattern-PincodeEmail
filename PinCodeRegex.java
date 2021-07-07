package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {

	public static void main(String[] args) {
		String pinCode = "400 088";
		
		String regex="^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pinCode);
		boolean result = matcher.matches();
		if(result)
           System.out.println("Valid Pincode");
		else
			System.out.println("InValid Pincode");
		
	}
}