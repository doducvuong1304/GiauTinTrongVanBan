package XuLi;

public class GiauTin {

	public GiauTin() {
		// TODO Auto-generated constructor stub
	}

	public static String toSpaceAndTab(String showText, String binary) {
		String SymbolTab = "\t";
		String SymbolSpace = " ";
		String Zero = "0";
		String One = "1";

		String encryptBinary = new String();
		char[] arrayBinary = binary.toCharArray();
		for (int i = 0; i < arrayBinary.length; i++) {
			if (String.valueOf(arrayBinary[i]).equals(Zero)) {
				encryptBinary += SymbolSpace;
			} else {
				encryptBinary += SymbolTab;
			}
		}
		System.out.println("Doan text ma hoa :" + encryptBinary + "Muhahah");

		String DataEncrypted = showText + encryptBinary;
		return DataEncrypted;
	}

}
