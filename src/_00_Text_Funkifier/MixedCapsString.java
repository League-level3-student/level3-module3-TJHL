package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String sarcasticString= "";
		String oneCharacter ="";
		for (int i = 0; i < s.length(); i++) {
			if(i%2!=1) {
				oneCharacter=s.toLowerCase();
				sarcasticString = sarcasticString + oneCharacter.charAt(i);
			}
			if(i%2==1) {
				oneCharacter=s.toUpperCase();
				sarcasticString = sarcasticString + oneCharacter.charAt(i);
			}		
		}
		return sarcasticString;
	}
}
