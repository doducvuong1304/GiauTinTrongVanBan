package XuLi;

public class GiaiMa {

	public GiaiMa() {
		// TODO Auto-generated constructor stub
	}
	public static String Decrypt(String EncryptBinary, int key) {
		String SymbolTab = "\t";
		String SymbolSpace = " ";
		String Zero = "0";
		String One = "1";
		
		String binary = new String();
		char[] arrayDataEncrypted = EncryptBinary.toCharArray();
		for (int i = key; i < arrayDataEncrypted.length; i++) {
			if(String.valueOf(arrayDataEncrypted[i]).equals(SymbolSpace)) {
				binary+=Zero;
			}else {
				binary+=One;
			}
		}
		
		return binary;
	}
}
