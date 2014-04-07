package schwarz.cipher;

import javax.swing.JOptionPane;


public class testmain {
	public static void main(String[] args){
		SubstitutionCipher s = new SubstitutionCipher("lüamkoßätsöqjiednychvzbfruxpgw");
		//String text = JOptionPane.showInputDialog(null, "Text verschlüsseln:");
		String text = "beispieltext: ich bin ein Array! äöüß";
		try{
			System.out.println(s.encrypt(text));
		}catch(StringIndexOutOfBoundsException e){
			System.out.print("FEHLER MIT DEM ANGEGEBENEN TEXT");
		}
		System.out.println(s.decrypt(s.encrypt(text)));
	}
}