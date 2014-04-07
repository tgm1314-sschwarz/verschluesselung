package schwarz.test;

import org.junit.Test;
import schwarz.cipher.SubstitutionCipher;

public class test {
	SubstitutionCipher s = new SubstitutionCipher("lüamkoßätsöqjiednychvzbfruxpgw");
	
	@Test
	public void encrypt(){
		String text = "ich bin ein array";
		if(!(s.encrypt(text).equals("taä üti kti lyylr"))){
			throw new RuntimeException("ERROR, at encrypting!");
		}	
	}
	@Test
	public void encryptdecrypt(){
		String text = "ich bin ein array";
		if(!(s.decrypt(s.encrypt(text)).equals(text))){
			throw new RuntimeException("ERROR, encrypted != decrypted!");
		}
	}
	@Test
	public void specialchars(){
		String text = "special character: ich bin ein array!";
		if(!(s.decrypt(s.encrypt(text)).equals(text))){
			throw new RuntimeException("ERROR, at special character test");
		}
	}
}
