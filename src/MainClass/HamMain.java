package MainClass;
import java.util.Scanner;
public class HamMain {

	public HamMain() {
	}
	
	public static void main(String[] args) {
		
		// doc file
		System.out.println("Nhap duong dan + File: ");
		Scanner scanner = new Scanner(System.in);
		String duongDan= scanner.next();
		// duong dan file: "D:/hello.txt"
		System.out.println("Noi dung file la: ");
		String noiDung= DocGhiFile.DocFile(duongDan);
		System.out.println(noiDung);
		// ghi file
	}

}
