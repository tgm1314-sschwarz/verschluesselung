package schwarz.cipher;

public class MonoAlphabeticCipher implements Cipher{
	private String secretAlphabet;
	private static final String A = "abcdefghijklmnopqrstuvwxyzäöüß";
	
	public MonoAlphabeticCipher(){
	}
	
	public String getSecretAlphabet(){
		return this.secretAlphabet;
	}
	
	protected void setSecretAlphabet(String sA){
		this.secretAlphabet = sA;
	}
	
	@Override
	public String encrypt(String ein) {
		boolean enthaeltzeichen = true;
		String verschluesselt = "";
		ein = ein.toLowerCase();
		for(int i = 0;i<ein.length();i++){
			enthaeltzeichen = true;
			//if(ein.charAt(i) == ' '){
			//	verschluesselt += ' ';
			//}
			for(int j = 0;j<A.length();j++){
				if(ein.charAt(i)==A.charAt(j)){
					verschluesselt += secretAlphabet.charAt(j);
					enthaeltzeichen = false;
				}
			}
			if(enthaeltzeichen == true){
				verschluesselt = verschluesselt + ein.charAt(i);
			}
		}
		return verschluesselt;
	}
	
	public String decrypt(String ein) {
		boolean enthaeltzeichen = true;
		String entschluesselt = "";
		ein = ein.toLowerCase();
		for(int i = 0;i<ein.length();i++){
			enthaeltzeichen = true;
			for(int j = 0;j<secretAlphabet.length();j++){
				if(ein.charAt(i) == secretAlphabet.charAt(j)){
					entschluesselt += A.charAt(j);
					enthaeltzeichen = false;
				}
			}
			if(enthaeltzeichen == true){
				entschluesselt += ein.charAt(i);
			}
		}
		return entschluesselt;
	}
}