package schwarz.cipher;

public class SubstitutionCipher extends MonoAlphabeticCipher{
	public SubstitutionCipher(String secretAlphabet){
		super.setSecretAlphabet(secretAlphabet.toLowerCase());
	}
	
	public void setSecretAlphabet(String secretAlphabet){
		this.setSecretAlphabet(secretAlphabet);
	}
}