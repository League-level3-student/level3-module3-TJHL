package _00_Text_Funkifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

public class CustomString extends SpecialString{
	
	 static HashMap <Character, Character> engAusKey; 
	//this is an australian test
	public CustomString(String s) {
		super(s);
		engAusKey = new HashMap <Character, Character>();
		engAusKey.put('a', 'b');
//		engAusKey.put('a', 'ɐ');
//		engAusKey.put('e', 'ǝ');
//		engAusKey.put('h', 'ɥ');
//		engAusKey.put('i', 'ᴉ');
//		engAusKey.put('l', 'l');
//		engAusKey.put('n', 'u');
//		engAusKey.put('r', 'ɹ');
//		engAusKey.put('s', 's');
//		engAusKey.put('t', 'ʇ');
//		engAusKey.put('u', 'n');
//		engAusKey.put('T', '┴');
//		engAusKey.put(' ', ' ');
		}
	
	@Override
	public String funkifyText(String s) {
	String aussieText ="";
	System.out.println(engAusKey.get('a'));
	/*		String reverseText ="";
		for (int i = s.length()-1; i > -1; i--) {
			reverseText=reverseText+s.charAt(i);
		}
			System.out.println(reverseText);
			
			
		for (int i = 0; i < reverseText.length(); i++) {
			if(engAusKey.keySet().contains(reverseText.charAt(i))) {
				System.out.println("yes");
				System.out.println(reverseText.charAt(i-1));
			}
	//		System.out.println(engAusKey.get(reverseText.charAt(i)));
		//	aussieText= aussieText + (engAusKey.get(reverseText.charAt(i)));
		//	System.out.println(aussieText);
			
		}	
		System.out.println(aussieText);
	*/	
		return aussieText;
	}
}