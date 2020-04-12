package XuLi;

import java.util.Scanner;

import DocGhiFile.*;


public class GiauTin {

	public GiauTin() { // constructor
	}
	
	// tinh nang giau tin
	public static void GiauTin(String tinGiau, String duongDan) {
		tinGiau= MaHoa.MaHoa(tinGiau); // ma hoa tin giau
		String noiDungFileGiau= DocFile.DocFile(duongDan); // doc noi dung file cover-text
		int key= MaHoa.TaoKey(noiDungFileGiau); // tao key = do dai noi dung file cover-text
		System.out.println("Key giau tin la: " + key);
		GhiFile.GhiFile(duongDan, tinGiau); // giau tin vao file cover-text
	}
}
