package _00_Text_Funkifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

public class CustomString extends SpecialString{
	
	HashMap <Character, Character> engAusKey = new HashMap <Character, Character>();
	//this is an australian test
	public CustomString(String s) {
		super(s);
		engAusKey.put('a', 'ɐ');
		engAusKey.put('e', 'ǝ');
		engAusKey.put('h', 'ɥ');
		engAusKey.put('i', 'ᴉ');
		engAusKey.put('l', 'l');
		engAusKey.put('n', 'u');
		engAusKey.put('r', 'ɹ');
		engAusKey.put('s', 's');
		engAusKey.put('t', 'ʇ');
		engAusKey.put('u', 'n');
		engAusKey.put('T', '┴');
		engAusKey.put(' ', ' ');
		}
	
	@Override
	public String funkifyText(String s) {
		String aussieText ="";
		String reverseText ="";
		for (int i = s.length()-1; i > -1; i--) {
			reverseText=reverseText+s.charAt(i);
		}
			
		for (int i = 0; i < reverseText.length()-1; i++) {
			aussieText= aussieText + (engAusKey.get(reverseText.charAt(i)));
			
		}	
		System.out.println(aussieText);
		
		return aussieText;
	}
}