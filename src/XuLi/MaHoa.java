package XuLi;

public class MaHoa {

	public MaHoa() { // constructor
	}
	
	// chuyen doan van ban (String) sang dang nhi phan (String)
	public static String ChuyenThanhNhiPhan(String vanBan) { 
		byte[] bytes = vanBan.getBytes(); // tao mang byte
		StringBuilder binary = new StringBuilder(); // tao StringBuilder
		for (byte b : bytes){
			int val = b;
			for (int i = 0; i < 8; i++){
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			//binary.append(' '); // cach ra moi ki tu duoc chuyen thanh nhi phan
		}	
		return binary.toString(); // 
	}
	
	// tao key= do dai chuoi - truyen vao 1 String va tra ve do dai String
	public static String TaoKey(String key) {
		int doDaiChuoi= key.length();
		key= String.valueOf(doDaiChuoi);
		return key;
	}
	
	// ma hoa van ban de giau tin
	public static String MaHoa(String vanBan) { 
		
		vanBan= ChuyenThanhNhiPhan(vanBan);
		return vanBan;
	};

}
